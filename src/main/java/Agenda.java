import javax.swing.*;
import java.awt.*;
import java.time.LocalDate;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;

public class Agenda {

    private final List<Consulta> consultas = new ArrayList<>();
    private LocalDate ultimaData = LocalDate.now();

    private final ImageIcon iconeMenu = new ImageIcon("src/assets/icons8-pegada-de-cachorro-32.png");

    public boolean validarAcesso() {
        int tentativas = 0;

        while (tentativas < 3) {

            String senhaDigitada = JOptionPane.showInputDialog(
                    null,
                    "Digite a senha para desbloquear o sistema:",
                    "Autenticação",
                    JOptionPane.WARNING_MESSAGE
            );

            if (senhaDigitada == null) {
                return false;
            }

            String chaveReal = ChaveProtegida.obterChaveReal(senhaDigitada);

            if (chaveReal != null) {
                NomeAPI.setApiKey(chaveReal);
                return true;
            }

            tentativas++;
            JOptionPane.showMessageDialog(
                    null,
                    "Senha incorreta! Tentativa " + tentativas + " de 3.",
                    "Erro de autenticação",
                    JOptionPane.ERROR_MESSAGE
            );
        }

        return false;
    }

    public void cadastrarConsulta() {

        if (consultas.size() >= 10) {
            JOptionPane.showMessageDialog(null, "Agenda cheia! Máximo de 10 consultas por dia atingido.");
            return;
        }

        try {
            String tipoAnimal = selecionarTipoAnimal();
            if (tipoAnimal == null) return;

            String nome;
            while (true) {
                nome = pedirNomeComAleatorio();
                if (nome == null) {
                    if (cancelarCadastro()) return;
                    else continue;
                }
                try {
                    validarNome(nome);
                    break;
                } catch (Validacao e) {
                    JOptionPane.showMessageDialog(null, e.getMessage());
                }
            }

            String raca;
            while (true) {
                raca = JOptionPane.showInputDialog(
                        null,
                        "Digite a raça do animal:",
                        "Raça",
                        JOptionPane.QUESTION_MESSAGE
                );
                if (raca == null) {
                    if (cancelarCadastro()) return;
                    else continue;
                }
                try {
                    validarRaca(raca);
                    break;
                } catch (Validacao e) {
                    JOptionPane.showMessageDialog(null, e.getMessage());
                }
            }

            int idade;
            while (true) {
                String idadeStr = JOptionPane.showInputDialog(
                        null,
                        "Digite a idade do animal:",
                        "Idade",
                        JOptionPane.QUESTION_MESSAGE
                );
                if (idadeStr == null) {
                    if (cancelarCadastro()) return;
                    else continue;
                }
                try {
                    idade = validarIdade(idadeStr);
                    break;
                } catch (Validacao e) {
                    JOptionPane.showMessageDialog(null, e.getMessage());
                }
            }

            Animal animal = switch (tipoAnimal) {
                case "Cachorro" -> new Cachorro(nome, raca, idade);
                case "Gato" -> new Gato(nome, raca, idade);
                case "Coelho" -> new Coelho(nome, raca, idade);
                default -> null;
            };

            String tipoAtendimento;
            while (true) {
                tipoAtendimento = selecionarTipoAtendimento();
                if (tipoAtendimento == null) {
                    if (cancelarCadastro()) return;
                    else continue;
                }
                break;
            }

            String doenca = "";
            if ("Consulta".equals(tipoAtendimento)) {
                String[] opcoes = {"Sim", "Não", "Cancelar"};
                boolean perguntarDoenca = true;

                while (perguntarDoenca) {
                    int resposta = JOptionPane.showOptionDialog(
                            null,
                            "O animal aparenta estar doente?",
                            "Confirmação",
                            JOptionPane.DEFAULT_OPTION,
                            JOptionPane.QUESTION_MESSAGE,
                            null,
                            opcoes,
                            opcoes[0]
                    );

                    if (resposta == 2 || resposta == JOptionPane.CLOSED_OPTION) {
                        if (cancelarCadastro()) return;
                        else continue;
                    }

                    if (resposta == 0) { // Sim
                        List<String> opcoesDoencas = new ArrayList<>();
                        if (animal instanceof Doencas d) {
                            opcoesDoencas = d.getDoencas();
                        }

                        if (!opcoesDoencas.isEmpty()) {
                            while (true) {
                                doenca = (String) JOptionPane.showInputDialog(
                                        null,
                                        "Selecione a enfermidade em questão:",
                                        "Doenças Comuns",
                                        JOptionPane.QUESTION_MESSAGE,
                                        null,
                                        opcoesDoencas.toArray(),
                                        opcoesDoencas.getFirst()
                                );
                                if (doenca != null) break;
                                if (cancelarCadastro()) return;
                            }
                        }
                    }
                    perguntarDoenca = false;
                }
            }

            consultas.add(new Consulta(animal, tipoAtendimento, doenca));
            JOptionPane.showMessageDialog(null, "Consulta cadastrada com sucesso!");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
        }
    }

    private boolean cancelarCadastro() {
        Object[] opcoes = {"Sim", "Não"};
        int confirmar = JOptionPane.showOptionDialog(
                null,
                "Você tem certeza que deseja cancelar o cadastro da consulta?",
                "Confirmar Cancelamento",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.WARNING_MESSAGE,
                null,
                opcoes,
                opcoes[1]
        );
        return confirmar == 0;
    }

    private String pedirNomeComAleatorio() {
        JTextField nomeField = new JTextField(15);
        JButton aleatorioButton = new JButton("Aleatório");

        JPanel panel = new JPanel();
        panel.add(new JLabel("Digite o nome do animal:"));
        panel.add(nomeField);
        panel.add(aleatorioButton);

        aleatorioButton.addActionListener(_ -> {
            String[] nomes = NomeAPI.getSugestoesNomes(1);
            if (nomes.length > 0) {
                nomeField.setText(nomes[0]);
            } else {
                JOptionPane.showMessageDialog(null, "Não foi possível buscar um nome.");
            }
        });

        int resultado = JOptionPane.showConfirmDialog(
                null, panel, "Cadastro de Nome", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE
        );

        if (resultado == JOptionPane.OK_OPTION) {
            return nomeField.getText();
        } else {
            return null;
        }
    }

    private void validarNome(String nome) throws Validacao {
        if (nome == null || nome.trim().length() < 2 || !nome.matches("[A-Za-zÀ-ÿ ]+")) {
            throw new Validacao("O nome deve conter apenas letras e no mínimo 2 caracteres.");
        }
    }

    private void validarRaca(String raca) throws Validacao {
        if (raca == null || raca.trim().isEmpty()) {
            throw new Validacao("A raça deve ser informada.");
        }
    }

    private int validarIdade(String idadeStr) throws Validacao {
        try {
            int idade = Integer.parseInt(idadeStr);
            if (idade <= 0) throw new Validacao("A idade deve ser um número positivo.");
            return idade;
        } catch (NumberFormatException e) {
            throw new Validacao("A idade deve ser um número inteiro válido.");
        }
    }

    public void listarConsultas() {

        if (consultas.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nenhuma consulta cadastrada.");
            return;
        }

        StringBuilder sb = new StringBuilder("CONSULTAS AGENDADAS\n\n");
        for (int i = 0; i < consultas.size(); i++) {
            Consulta c = consultas.get(i);
            Animal a = c.animal();

            if (i > 0) {
                sb.append("------------------------------\n\n");
            }

            sb.append((i + 1)).append(") ")
                    .append("Tipo de Animal: ").append(a.getClass().getSimpleName()).append("\n")
                    .append("Nome: ").append(a.getNome()).append("\n")
                    .append("Raça: ").append(a.getRaca()).append("\n")
                    .append("Idade: ").append(a.getIdade()).append(" anos\n")
                    .append("Atendimento: ").append(c.tipoAtendimento()).append("\n");

            String d = c.doenca();
            if (d != null && !d.isEmpty()) {
                sb.append("Doença: ").append(d).append("\n");
            }

            sb.append("\n");
        }

        JFrame janela = new JFrame("Lista de Consultas");
        janela.setSize(700, 650);
        janela.setMinimumSize(new Dimension(700, 650));
        janela.setLocationRelativeTo(null);
        janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        janela.setIconImage(iconeMenu.getImage());

        JPanel painel = new JPanel();
        painel.setBackground(new Color(30, 144, 255));
        painel.setLayout(new BorderLayout(15, 15));
        painel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        ImageIcon listaIcone = new ImageIcon("src/assets/icons8-lista-32.png");
        JPanel painelTitulo = criarPainelTitulo(listaIcone);

        JTextArea textArea = new JTextArea(sb.toString());
        textArea.setFont(new Font("Arial", Font.PLAIN, 20));
        textArea.setEditable(false);
        textArea.setFocusable(false);
        textArea.setBackground(new Color(240, 248, 255));
        textArea.setForeground(Color.BLACK);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);

        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setBorder(BorderFactory.createLineBorder(Color.WHITE, 3, true));
        scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        JButton btnImprimir = new JButton("Imprimir");
        JButton btnFechar = new JButton("Fechar");
        estilizarBotao(btnImprimir);
        estilizarBotao(btnFechar);

        btnFechar.addActionListener(_ -> janela.dispose());
        btnImprimir.addActionListener(_ -> {
            try {
                textArea.print();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null,
                        "Erro ao imprimir o texto: " + ex.getMessage(),
                        "Erro",
                        JOptionPane.ERROR_MESSAGE
                );
            }
        });

        JPanel painelBotoes = new JPanel();
        painelBotoes.setBackground(new Color(30, 144, 255));
        painelBotoes.add(btnImprimir);
        painelBotoes.add(btnFechar);

        painel.add(painelTitulo, BorderLayout.NORTH);
        painel.add(scrollPane, BorderLayout.CENTER);
        painel.add(painelBotoes, BorderLayout.SOUTH);

        janela.setContentPane(painel);
        janela.setVisible(true);
    }


    public int getNumeroConsultas() {
        return consultas.size();
    }

    public LocalDate getUltimaData() {
        return ultimaData;
    }

    public void limparConsultasParaNovoDia() {
        consultas.clear();
        ultimaData = LocalDate.now();
    }

    private void estilizarBotao(JButton botao) {
        botao.setPreferredSize(new Dimension(200, 50));
        botao.setForeground(Color.WHITE);
        botao.setBackground(new Color(0, 90, 200));
        botao.setFont(new Font("Arial", Font.BOLD, 20));
        botao.setFocusPainted(false);
        botao.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));

        botao.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        botao.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                botao.setBackground(new Color(65, 105, 225));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                botao.setBackground(new Color(0, 90, 200));
            }
        });
    }

    static class NomeAPI {

        private static final String URL_API =
                "https://api.api-ninjas.com/v1/babynames?gender=neutral";

        private static String API_KEY = null;

        public static void setApiKey(String key) {
            API_KEY = key;
        }

        public static String[] getSugestoesNomes(int quantidade) {

            try {
                if (API_KEY == null || API_KEY.isEmpty()) {
                    System.err.println("⚠ API não desbloqueada: chave vazia.");
                    return new String[0];
                }

                HttpClient client = HttpClient.newHttpClient();

                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(URL_API))
                        .header("X-Api-Key", API_KEY)
                        .GET()
                        .build();

                HttpResponse<String> response =
                        client.send(request, HttpResponse.BodyHandlers.ofString());

                if (response.statusCode() != 200) {
                    System.err.println("Erro ao buscar nomes: HTTP " + response.statusCode());
                    return new String[0];
                }

                String body = response.body()
                        .replace("[", "")
                        .replace("]", "")
                        .replace("\"", "");

                String[] nomesArray = body.split(",");

                List<String> lista = new ArrayList<>();

                for (int i = 0; i < nomesArray.length && lista.size() < quantidade; i++) {
                    String nome = nomesArray[i].trim();
                    if (!nome.isEmpty()) lista.add(nome);
                }

                return lista.toArray(new String[0]);

            } catch (Exception e) {
                return new String[0];
            }
        }
    }


    private JPanel criarPainelTitulo(ImageIcon icone) {
        JLabel titulo = new JLabel("Consultas Cadastradas", SwingConstants.CENTER);
        titulo.setFont(new Font("Arial", Font.BOLD, 30));
        titulo.setForeground(Color.WHITE);
        titulo.setIcon(icone);
        titulo.setIconTextGap(15);

        JPanel painelTitulo = new JPanel(new FlowLayout(FlowLayout.CENTER));
        painelTitulo.setBackground(new Color(30, 144, 255));
        painelTitulo.add(titulo);

        return painelTitulo;
    }

    private JPanel criarPainelCancelar(String[] selecao, JDialog dialog) {
        JPanel painelBotoes = new JPanel();
        painelBotoes.setBackground(Color.WHITE);
        JButton btnCancelar = new JButton("Cancelar");
        btnCancelar.addActionListener(_ -> {
            selecao[0] = null;
            dialog.dispose();
        });
        painelBotoes.add(btnCancelar);
        return painelBotoes;
    }

    private String selecionarTipoAnimal() {
        JDialog dialog = new JDialog((Frame) null, "Selecione", true);
        dialog.setSize(650, 380);
        dialog.setResizable(false);
        dialog.setLocationRelativeTo(null);
        dialog.setLayout(new BorderLayout());
        dialog.getContentPane().setBackground(Color.WHITE);

        JLabel titulo = new JLabel("Selecione o Tipo de Animal", JLabel.CENTER);
        titulo.setFont(new Font("Arial", Font.BOLD, 22));
        titulo.setBorder(BorderFactory.createEmptyBorder(20, 0, 10, 0));
        dialog.add(titulo, BorderLayout.NORTH);

        JPanel painel = new JPanel(new GridLayout(1, 3, 20, 10));
        painel.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
        painel.setBackground(Color.WHITE);

        final String[] selecao = {null};
        painel.add(criarItemSelecao("Cachorro", "src/assets/Scooby-Doo.png", selecao, dialog));
        painel.add(criarItemSelecao("Gato", "src/assets/gatodebotas.png", selecao, dialog));
        painel.add(criarItemSelecao("Coelho", "src/assets/coelhodoido.png", selecao, dialog));

        dialog.add(painel, BorderLayout.CENTER);
        dialog.add(criarPainelCancelar(selecao, dialog), BorderLayout.SOUTH);

        dialog.setVisible(true);
        return selecao[0];

    }

    private JPanel criarItemSelecao(String nome, String caminhoImagem, String[] selecao, JDialog dialog) {
        JPanel container = new JPanel(new BorderLayout());
        container.setBackground(new Color(240, 240, 240));
        container.setBorder(BorderFactory.createLineBorder(Color.GRAY, 2));
        container.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        container.setPreferredSize(new Dimension(240, 260)); // área maior

        ImageIcon icon;
        try {
            icon = new ImageIcon(caminhoImagem);
            Image img = icon.getImage().getScaledInstance(160, 160, Image.SCALE_SMOOTH);
            icon = new ImageIcon(img);
        } catch (Exception e) {
            icon = null;
        }

        JLabel imagem = new JLabel(icon, JLabel.CENTER);
        imagem.setPreferredSize(new Dimension(180, 180));
        container.add(imagem, BorderLayout.CENTER);

        JLabel texto = new JLabel(nome, JLabel.CENTER);
        texto.setFont(new Font("Arial", Font.BOLD, 18));
        texto.setBorder(BorderFactory.createEmptyBorder(5, 0, 10, 0));
        container.add(texto, BorderLayout.SOUTH);

        container.addMouseListener(new java.awt.event.MouseAdapter() {

            @Override
            public void mouseEntered(java.awt.event.MouseEvent e) {
                container.setBackground(new Color(255, 255, 255)); // mais claro
            }

            @Override
            public void mouseExited(java.awt.event.MouseEvent e) {
                container.setBackground(new Color(240, 240, 240)); // cor original
            }

            @Override
            public void mouseClicked(java.awt.event.MouseEvent e) {
                selecao[0] = nome;
                dialog.dispose();
            }

        });

        return container;
    }

    private String selecionarTipoAtendimento() {
        JDialog dialog = new JDialog((Frame) null, "Tipo de Atendimento", true);
        dialog.setSize(1000, 420);
        dialog.setResizable(false);
        dialog.setLocationRelativeTo(null);
        dialog.setLayout(new BorderLayout(10, 10));

        JLabel titulo = new JLabel("Selecione o tipo de atendimento:", JLabel.CENTER);
        titulo.setFont(new Font("Arial", Font.BOLD, 18));
        titulo.setBorder(BorderFactory.createEmptyBorder(10, 0, 0, 0));
        dialog.add(titulo, BorderLayout.NORTH);

        JPanel painel = new JPanel(new GridLayout(1, 4, 25, 10));
        painel.setBorder(BorderFactory.createEmptyBorder(10, 20, 0, 20));
        painel.setBackground(Color.WHITE);

        final String[] selecao = {null};
        painel.add(criarItemSelecao("Banho", "src/assets/gatobanho.jpg", selecao, dialog));
        painel.add(criarItemSelecao("Tosa", "src/assets/coelhotosa.png", selecao, dialog));
        painel.add(criarItemSelecao("Banho e Tosa", "src/assets/banhoetosa.jpg", selecao, dialog));
        painel.add(criarItemSelecao("Consulta", "src/assets/consulta.jpg", selecao, dialog));

        dialog.add(painel, BorderLayout.CENTER);
        dialog.add(criarPainelCancelar(selecao, dialog), BorderLayout.SOUTH);

        dialog.setVisible(true);
        return selecao[0];

    }

}
