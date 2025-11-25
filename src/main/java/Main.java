package TrabalhoFinal;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();

        while (true) {
            String opcao = JOptionPane.showInputDialog(null,
                    "Sistema de Agenda do Veterinário\n\n" +
                            "1 - Cadastrar Consulta\n" +
                            "2 - Listar Consultas\n" +
                            "3 - Sair\n\nEscolha uma opção:");

            if (opcao == null || opcao.equals("3")) break;

            switch (opcao) {
                case "1":
                    try {
                        cadastrarConsulta(agenda);
                    } catch (ValidacaoException e) {
                        JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
                    }
                    break;
                case "2":
                    JOptionPane.showMessageDialog(null, agenda.listarConsultas());
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!");
            }
        }
    }

    private static void cadastrarConsulta(Agenda agenda) throws ValidacaoException {
        String[] tiposAnimais = {"Cachorro", "Gato", "Coelho"};
        String tipoAnimal = (String) JOptionPane.showInputDialog(null, "Selecione o tipo de animal:",
                "Animal", JOptionPane.QUESTION_MESSAGE, null, tiposAnimais, tiposAnimais[0]);

        if (tipoAnimal == null)
            return;

        String nome = JOptionPane.showInputDialog("Nome do animal:");
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Idade do animal:"));
        String raca = JOptionPane.showInputDialog("Raça do animal:");

        Animal animal;
        switch (tipoAnimal) {
            case "Cachorro": animal = new Cachorro(nome, idade, raca); break;
            case "Gato": animal = new Gato(nome, idade, raca); break;
            case "Coelho": animal = new Coelho(nome, idade, raca); break;
            default: throw new ValidacaoException("Tipo de animal inválido!");
        }

        String[] tiposConsulta = {"Banho", "Tosa", "Banho e Tosa", "Consulta"};
        String tipoAtendimento = (String) JOptionPane.showInputDialog(null, "Tipo de atendimento:",
                "Consulta", JOptionPane.QUESTION_MESSAGE, null, tiposConsulta, tiposConsulta[0]);

        String doenca = null;
        if ("Consulta".equals(tipoAtendimento)) {
            String[] doencas = animal.getDoencasComuns();
            doenca = (String) JOptionPane.showInputDialog(null,
                    "Selecione a doença (se aplicável):",
                    "Doença", JOptionPane.QUESTION_MESSAGE, null, doencas, doencas[0]);
        }

        Consulta consulta = new Consulta(animal, tipoAtendimento, doenca);
        agenda.adicionarConsulta(consulta);

        JOptionPane.showMessageDialog(null, "Consulta cadastrada com sucesso!");
    }

}