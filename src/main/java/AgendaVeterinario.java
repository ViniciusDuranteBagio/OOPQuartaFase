import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class AgendaVeterinario {


    private static List<Consulta> agenda = new ArrayList<>();

    public static void main(String[] args) {

        while (true) {
            String[] menuOpcoes = {"Cadastrar Consulta", "Listar Consultas", "Excluir Consulta", "Sair"};

            int escolha = JOptionPane.showOptionDialog(
                    null,
                    "Bem-vindo ao Sistema!\nConsultas: " + agenda.size(),
                    "Menu Principal",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.INFORMATION_MESSAGE,
                    null,
                    menuOpcoes,
                    menuOpcoes[0]
            );

            switch (escolha) {
                case 0: cadastrarConsulta(); break;
                case 1: listarConsultas(); break;
                case 2: excluirConsulta(); break;
                case 3:
                case -1: System.exit(0); break;
            }
        }
    }


    private static void cadastrarConsulta() {


        try {

            String dataInput = JOptionPane.showInputDialog("Digite a data da consulta (dd/MM/yyyy):");
            if (dataInput == null || dataInput.trim().isEmpty()) {
                throw new ValidacaoException("A data é obrigatória.");
            }
            String dataTexto = dataInput.trim();


            DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate dataDigitada = LocalDate.parse(dataTexto, formatador);
            LocalDate hoje = LocalDate.now();

            if (dataDigitada.isBefore(hoje)) {
                throw new ValidacaoException("Não é possível agendar para datas passadas!\nHoje é: " + hoje.format(formatador));
            }


            int contadorDoDia = 0;


            for (Consulta c : agenda) {

                if (c.getData().equals(dataTexto)) {
                    contadorDoDia++;
                }
            }


            if (contadorDoDia >= 10) {
                throw new ValidacaoException("Agenda LOTADA para o dia " + dataTexto + "!\nTente outra data.");
            }




            String[] tiposAnimais = {"Cachorro", "Gato", "Coelho"};
            String tipoAnimal = (String) JOptionPane.showInputDialog(
                    null, "Selecione o animal:", "Tipo",
                    JOptionPane.QUESTION_MESSAGE, null, tiposAnimais, tiposAnimais[0]);
            if (tipoAnimal == null) return;

            // 5. Dados do Animal
            String nome = validarNome(JOptionPane.showInputDialog("Nome do " + tipoAnimal + ":"));
            int idade = validarIdade(JOptionPane.showInputDialog("Idade do " + tipoAnimal + ":"));
            String raca = validarRaca(JOptionPane.showInputDialog("Raça do " + tipoAnimal + ":"));

            Animal animal;
            switch (tipoAnimal) {
                case "Cachorro": animal = new Cachorro(nome, idade, raca); break;
                case "Gato": animal = new Gato(nome, idade, raca); break;
                default: animal = new Coelho(nome, idade, raca); break;
            }


            String[] tiposAtendimento = {"Banho", "Tosa", "Banho e Tosa", "Consulta"};
            String atendimento = (String) JOptionPane.showInputDialog(
                    null, "Selecione o serviço:", "Atendimento",
                    JOptionPane.QUESTION_MESSAGE, null, tiposAtendimento, tiposAtendimento[0]);
            if (atendimento == null) return;


            String doenca = null;
            if (atendimento.equals("Consulta")) {
                int resp = JOptionPane.showConfirmDialog(null, "O animal está doente?", "Triagem", JOptionPane.YES_NO_OPTION);
                if (resp == JOptionPane.YES_OPTION) {
                    String[] doencasPossiveis = animal.getDoencasComuns();
                    doenca = (String) JOptionPane.showInputDialog(
                            null, "Selecione a doença:", "Doenças de " + tipoAnimal,
                            JOptionPane.QUESTION_MESSAGE, null, doencasPossiveis, doencasPossiveis[0]);
                }
            }


            Consulta novaConsulta = new Consulta(animal, atendimento, doenca, dataTexto);
            agenda.add(novaConsulta);

            JOptionPane.showMessageDialog(null, "Agendado para " + dataTexto + " com sucesso!");

        } catch (DateTimeParseException e) {
            JOptionPane.showMessageDialog(null, "Data inválida! Use o formato dia/mês/ano (ex: 25/12/2025).", "Erro de Data", JOptionPane.ERROR_MESSAGE);
        } catch (ValidacaoException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro de Validação", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
        }
    }


    private static void excluirConsulta() {

        if (agenda.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Não há consultas para excluir.");
            return;
        }


        StringBuilder listaParaExcluir = new StringBuilder("Digite o NÚMERO da consulta para excluir:\n\n");
        for (int i = 0; i < agenda.size(); i++) {

            listaParaExcluir.append((i + 1)).append(" - ")
                    .append("Data: ").append(agenda.get(i).getData()).append(" | ")
                    .append("Animal: ").append(agenda.get(i).toString().split("\n")[2]) // Pega só a linha do nome para resumir
                    .append("\n");
        }

        try {

            String input = JOptionPane.showInputDialog(null, listaParaExcluir.toString(), "Excluir Consulta", JOptionPane.QUESTION_MESSAGE);

            if (input == null) return;

            int numeroEscolhido = Integer.parseInt(input);


            if (numeroEscolhido < 1 || numeroEscolhido > agenda.size()) {
                throw new ValidacaoException("Número inválido! Escolha entre 1 e " + agenda.size());
            }


            Consulta removida = agenda.remove(numeroEscolhido - 1);

            JOptionPane.showMessageDialog(null, "Consulta do animal foi removida com sucesso!");

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Digite apenas o número da consulta.", "Erro", JOptionPane.ERROR_MESSAGE);
        } catch (ValidacaoException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    private static void listarConsultas() {
        if (agenda.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nenhuma consulta cadastrada ainda.", "Lista de Consultas", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        StringBuilder lista = new StringBuilder("--- Consultas Agendadas ---\n\n");
        for (int i = 0; i < agenda.size(); i++) {
            lista.append("Consulta #").append(i + 1).append("\n");
            lista.append(agenda.get(i).toString()).append("\n\n");
        }


        javax.swing.JTextArea textArea = new javax.swing.JTextArea(lista.toString());
        textArea.setEditable(false);
        javax.swing.JScrollPane scrollPane = new javax.swing.JScrollPane(textArea);
        scrollPane.setPreferredSize(new java.awt.Dimension(500, 400));

        JOptionPane.showMessageDialog(null, scrollPane, "Lista de Consultas", JOptionPane.INFORMATION_MESSAGE);
    }



    private static String validarNome(String nome) throws ValidacaoException {
        if (nome == null) throw new ValidacaoException("Cadastro cancelado.");
        nome = nome.trim();

        if (nome.length() < 2 || !nome.matches("[a-zA-Z ]+")) {
            throw new ValidacaoException("Nome inválido! Deve conter pelo menos 2 caracteres e apenas letras e espaços.");
        }
        return nome;
    }

    private static int validarIdade(String idadeStr) throws ValidacaoException, NumberFormatException {
        if (idadeStr == null) throw new ValidacaoException("Cadastro cancelado.");

        int idade = Integer.parseInt(idadeStr.trim());


        if (idade <= 0) {
            throw new ValidacaoException("Idade inválida! Deve ser um número inteiro maior que zero.");
        }
        return idade;
    }

    private static String validarRaca(String raca) throws ValidacaoException {
        if (raca == null) throw new ValidacaoException("Cadastro cancelado.");
        raca = raca.trim();

        if (raca.isEmpty()) {
            throw new ValidacaoException("Raça inválida! A raça deve ser informada.");
        }
        return raca;
    }
}