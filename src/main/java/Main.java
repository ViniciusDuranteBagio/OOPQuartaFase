import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        String menu = "1 - Cadastrar Consulta" +
                "\n2 - Listar Consultas" +
                "\n3 - Sair";

        while (true) {
            String opc = JOptionPane.showInputDialog(menu);
            if (opc == null) break;

            switch (opc) {
                case "1":
                    cadastrarConsulta(agenda);
                    break;
                case "2":
                    JOptionPane.showMessageDialog(null, agenda.listarConsultas());
                    break;
                case "3":
                    JOptionPane.showMessageDialog(null, "Encerrando....");
                    return;
                default:
                    JOptionPane.showMessageDialog(null, "Opção Inválida");
            }
        }
    }

    private static void cadastrarConsulta(Agenda agenda) {

        // Verifica espaço antes de tudo (usa adicionar apenas depois de criar a consulta)
        if (agenda == null) {
            JOptionPane.showMessageDialog(null, "Agenda não inicializada!");
            return;
        }
        // Dados do animal
        String[] especies = {"Cachorro", "Gato", "Coelho"};
        String especie = (String) JOptionPane.showInputDialog(
                null,
                "Selecione a espécie:",
                "Espécie",
                JOptionPane.QUESTION_MESSAGE,
                null,
                especies,
                especies[0]
        );
        if (especie == null) return;

        String nome = JOptionPane.showInputDialog("Nome do animal:");
        if (nome == null || nome.trim().isEmpty()) return;

        String idadeStr = JOptionPane.showInputDialog("Idade:");
        if (idadeStr == null) return;

        int idade;
        try {
            idade = Integer.parseInt(idadeStr.trim());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Idade inválida!");
            return;
        }

        String raca = JOptionPane.showInputDialog("Raça:");
        if (raca == null) return;

        Animal animal;
        if ("Cachorro".equals(especie)) {
            animal = new Cachorro(nome, idade, raca);
        } else if ("Gato".equals(especie)) {
            animal = new Gato(nome, idade, raca);
        } else {
            animal = new Coelho(nome, idade, raca);
        }

        String[] tipos = {"Banho", "Tosa", "Banho e Tosa", "Consulta"};
        String tipoConsulta = (String) JOptionPane.showInputDialog(
                null,
                "Selecione o tipo de consulta:",
                "Consulta",
                JOptionPane.QUESTION_MESSAGE,
                null,
                tipos,
                tipos[0]
        );
        if (tipoConsulta == null) return;

        String doenca = null;
        if ("Consulta".equals(tipoConsulta)) {
            int resp = JOptionPane.showConfirmDialog(null,
                    "O animal está doente?",
                    "Doença",
                    JOptionPane.YES_NO_OPTION);
            if (resp == JOptionPane.YES_OPTION) {
                doenca = animal.escolherDoenca();
            }
        }

        Consulta c = new Consulta(animal, tipoConsulta, doenca);

        if (agenda.adicionarConsulta(c)) {
            JOptionPane.showMessageDialog(null, "Consulta cadastrada com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Limite diário de consultas atingido!");
        }
    }
}
