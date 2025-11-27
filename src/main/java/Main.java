import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();

        while (true) {

            String opcao = JOptionPane.showInputDialog(
                    "Clínica Veterinária\n\n" +
                            "1 - Listar consultas\n" +
                            "2 - Cadastrar nova consulta\n" +
                            "0 - Sair\n\n" +
                            "Digite sua opção:"
            ).trim();

            if (opcao == null) break;

            try {
                switch (opcao) {

                    case "1":
                        JOptionPane.showMessageDialog(null, agenda.listar());
                        break;

                    case "2":
                        Consulta consulta = cadastrarConsulta();
                        agenda.adicionar(consulta);

                        JOptionPane.showMessageDialog(null,
                                "Consulta cadastrada com sucesso.");
                        break;

                    case "0":
                        JOptionPane.showMessageDialog(null,
                                "Saindo do sistema.");
                        System.exit(0);
                        break;

                    default:
                        JOptionPane.showMessageDialog(null,
                                "Opção inválida. Tente novamente.");
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,
                        "Ocorreu um erro:\n" + e.getMessage());
            }
        }
    }

    private static Consulta cadastrarConsulta() {

        String tipoAnimal = JOptionPane.showInputDialog(
                "Informe o tipo de animal:\nCachorro, Gato ou Coelho"
        ).trim();

        String nome = JOptionPane.showInputDialog("Nome do animal:").trim();
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Idade:"));
        String raca = JOptionPane.showInputDialog("Raça:").trim();

        Animal animal;

        if (tipoAnimal.equalsIgnoreCase("Cachorro"))
            animal = new Cachorro(nome, idade, raca);
        else if (tipoAnimal.equalsIgnoreCase("Gato"))
            animal = new Gato(nome, idade, raca);
        else if (tipoAnimal.equalsIgnoreCase("Coelho"))
            animal = new Coelho(nome, idade, raca);
        else
            throw new ValidacaoException("Tipo de animal inválido.");

        String tipo = JOptionPane.showInputDialog(
                "Tipo de atendimento:\nBanho\nTosa\nBanho e Tosa\nConsulta"
        ).trim();

        String doenca = null;

        if (tipo.equalsIgnoreCase("Consulta")) {
            String[] doencas = animal.getDoencasComuns();

            String lista = "Selecione a doença:\n\n";
            for (int i = 0; i < doencas.length; i++) {
                lista += (i + 1) + " - " + doencas[i] + "\n";
            }

            int escolha = Integer.parseInt(JOptionPane.showInputDialog(lista));
            doenca = doencas[escolha - 1];
        }

        return new Consulta(animal, tipo, doenca);
    }
}