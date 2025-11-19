import javax.swing.*;
import java.awt.*;

public class TelaPrincipal extends JFrame {

    private Agenda agenda = new Agenda();

    public TelaPrincipal() {
        super("Agenda Veterinária");

        // Botões simples na tela
        JButton btnCadastrar = new JButton("Cadastrar Consulta");
        JButton btnListar = new JButton("Listar Consultas");

        btnCadastrar.setFont(new Font("Arial", Font.BOLD, 18));
        btnListar.setFont(new Font("Arial", Font.BOLD, 18));

        // Adiciona os botões no painel central
        JPanel painel = new JPanel();
        painel.add(btnCadastrar);
        painel.add(btnListar);
        setContentPane(painel);

        setSize(400, 150);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Ações dos botões
        btnCadastrar.addActionListener(e -> cadastrarConsulta());
        btnListar.addActionListener(e -> listarConsultas());
    }

    private void cadastrarConsulta() {
        try {
            // Tipo de animal
            String[] tipos = {"Cachorro", "Gato", "Coelho"};
            String tipo = (String) JOptionPane.showInputDialog(
                    this, "Selecione o animal:", "Animal",
                    JOptionPane.QUESTION_MESSAGE, null, tipos, tipos[0]);
            if (tipo == null) return;

            // Nome, idade e raça
            String nome = JOptionPane.showInputDialog("Nome:");
            Validador.validarNome(nome);

            int idade = Integer.parseInt(JOptionPane.showInputDialog("Idade:"));
            Validador.validarIdade(idade);

            String raca = JOptionPane.showInputDialog("Raça:");
            if (raca.isBlank()) throw new ValidacaoException("Raça inválida.");

            Animal animal = switch (tipo) {
                case "Cachorro" -> new Cachorro(nome, idade, raca);
                case "Gato" -> new Gato(nome, idade, raca);
                default -> new Coelho(nome, idade, raca);
            };

            // Tipo de atendimento
            String[] atendimentos = {"Banho", "Tosa", "Banho e Tosa", "Consulta"};

            String atendimento = (String) JOptionPane.showInputDialog(
                    this, "Tipo de atendimento:", "Atendimento",
                    JOptionPane.QUESTION_MESSAGE, null, atendimentos, atendimentos[0]);
            if (atendimento == null) return;

            // Doença (se consulta)
            String doenca = null;
            if (atendimento.equals("Consulta")) {
                int doente = JOptionPane.showConfirmDialog(this, "Animal está doente?");
                if (doente == JOptionPane.YES_OPTION) {
                    String[] doencas = animal.getDoencas();
                    doenca = (String) JOptionPane.showInputDialog(
                            this, "Selecione a doença:", "Doenças",
                            JOptionPane.QUESTION_MESSAGE, null, doencas, doencas[0]);
                }
            }

            agenda.adicionar(new Consulta(animal, atendimento, doenca));
            JOptionPane.showMessageDialog(this, "Consulta cadastrada com sucesso!");

        } catch (ValidacaoException e) {
            JOptionPane.showMessageDialog(this, "Erro: " + e.getMessage());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro inesperado: " + e.getMessage());
        }
    }

    private void listarConsultas() {
        if (agenda.vazia()) {
            JOptionPane.showMessageDialog(this, "Nenhuma consulta cadastrada.");
            return;
        }

        StringBuilder sb = new StringBuilder();
        for (String consulta : agenda.toStringArray()) sb.append(consulta).append("\n\n");

        JTextArea area = new JTextArea(sb.toString());
        area.setEditable(false);
        JScrollPane scroll = new JScrollPane(area);
        scroll.setPreferredSize(new Dimension(400, 300));

        JOptionPane.showMessageDialog(this, scroll, "Consultas", JOptionPane.PLAIN_MESSAGE);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new TelaPrincipal().setVisible(true));
    }
}
