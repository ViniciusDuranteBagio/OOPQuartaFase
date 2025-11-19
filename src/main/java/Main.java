import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    private static final int LIMITE_CONSULTAS = 10;
    private static List<Consulta> agenda = new ArrayList<>();

    public static void main(String[] args) {
        while (true) {
            String[] opcoes = {"Listar Consultas", "Cadastrar Consulta", "Sair"};
            int escolha = JOptionPane.showOptionDialog(null, "Escolha uma opção:",
                    "Agenda do Veterinário", JOptionPane.DEFAULT_OPTION,
                    JOptionPane.INFORMATION_MESSAGE, null, opcoes, opcoes[0]);

            switch (escolha) {
                case 0 -> listarConsultas();
                case 1 -> cadastrarConsulta();
                default -> System.exit(0);
            }
        }
    }

    private static void listarConsultas() {
        if (agenda.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nenhuma consulta cadastrada ainda.");
        } else {
            StringBuilder sb = new StringBuilder("Consultas do dia:\n\n");
            for (int i = 0; i < agenda.size(); i++) {
                sb.append((i + 1)).append(") ").append(agenda.get(i)).append("\n");
            }
            JOptionPane.showMessageDialog(null, sb.toString());
        }
    }

    private static void cadastrarConsulta() {
        try {
            if (agenda.size() >= LIMITE_CONSULTAS) {
                throw new ValidacaoException("Agenda cheia! Máximo de 10 consultas por dia.");
            }

            String tipoAnimal = (String) JOptionPane.showInputDialog(null, "Tipo de animal:",
                    "Cadastro", JOptionPane.QUESTION_MESSAGE, null,
                    new String[]{"Cachorro", "Gato", "Coelho"}, "Cachorro");

            String nome = JOptionPane.showInputDialog("Nome do animal:");
            validarNome(nome);

            int idade = Integer.parseInt(JOptionPane.showInputDialog("Idade do animal:"));
            validarIdade(idade);

            String raca = JOptionPane.showInputDialog("Raça do animal:");
            if (raca == null || raca.trim().isEmpty()) throw new ValidacaoException("Raça deve ser informada!");

            Animal animal = switch (tipoAnimal) {
                case "Gato" -> new Gato(nome, idade, raca);
                case "Coelho" -> new Coelho(nome, idade, raca);
                default -> new Cachorro(nome, idade, raca);
            };

            String tipoAtendimento = (String) JOptionPane.showInputDialog(null, "Tipo de atendimento:",
                    "Atendimento", JOptionPane.QUESTION_MESSAGE, null,
                    new String[]{"Banho", "Tosa", "Banho e Tosa", "Consulta"}, "Banho");

            String doenca = null;
            if ("Consulta".equals(tipoAtendimento)) {
                int resp = JOptionPane.showConfirmDialog(null, "O animal está doente?", "Consulta", JOptionPane.YES_NO_OPTION);
                if (resp == JOptionPane.YES_OPTION) {
                    doenca = (String) JOptionPane.showInputDialog(null, "Selecione a doença:",
                            "Doença", JOptionPane.QUESTION_MESSAGE, null,
                            animal.getDoencasComuns(), null);
                }
            }

            agenda.add(new Consulta(animal, tipoAtendimento, doenca));
            JOptionPane.showMessageDialog(null, "Consulta cadastrada com sucesso!");

        } catch (ValidacaoException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Idade inválida. Digite um número inteiro positivo.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro inesperado: " + e.getMessage());
        }
    }

    private static void validarNome(String nome) throws ValidacaoException {
        if (nome == null || !nome.matches("[A-Za-zÀ-ÿ\\s]{2,}")) {
            throw new ValidacaoException("Nome deve conter apenas letras e no mínimo 2 caracteres.");
        }
    }

    private static void validarIdade(int idade) throws ValidacaoException {
        if (idade <= 0) {
            throw new ValidacaoException("Idade deve ser um número positivo.");
        }
    }
}