import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        AgendaVeterinario agendaVeterinario = new AgendaVeterinario();
        int opcao = 0;

        do {
            String menu = """
                    -----MENU CLINICA VETERINARIA-----
                    1- CADASTRAR CONSULTAS
                    2- LISTAR CONSULTAS
                    3- SAIR
                    """;
            String input = JOptionPane.showInputDialog(menu);
            if (input == null) break;
            opcao = Integer.parseInt(input);

            switch (opcao) {
                case 1:
                    try {
                        String tipoAnimalString = JOptionPane.showInputDialog("Tipo de animal:\n 1- Cachorro\n  2- Gato\n  3- Coelho");
                        int tipoAnimal = Integer.parseInt(tipoAnimalString);

                        String name = JOptionPane.showInputDialog("Nome do animal: ");
                        int age = Integer.parseInt(JOptionPane.showInputDialog("Idade do animal: "));
                        String breed = JOptionPane.showInputDialog("Raca do animal: ");

                        Animal animal = null;
                        switch (tipoAnimal) {
                            case 1:
                                animal = new Cachorro(name, age, breed);
                                break;
                            case 2:
                                animal = new Gato(name, age, breed);
                                break;
                            case 3:
                                animal = new Coelho(name, age, breed);
                                break;
                        }
                        String tipoAtendimento = JOptionPane.showInputDialog("Tipo de atendimento:\n -Banho\n -Tosa\n -Banho e Tosa\n -Consulta");

                        String disease = null;
                        if (tipoAtendimento.equalsIgnoreCase("Consulta")) {
                            String estaDoente = JOptionPane.showInputDialog("O animal esta doente? (s/n)");
                            if (estaDoente != null && estaDoente.equalsIgnoreCase("s")) {
                                disease = animal.escolherDoenca();
                            }
                        }

                        Consulta consulta = new Consulta(animal, tipoAtendimento, disease);


                        agendaVeterinario.adicionarConsulta(consulta);
                        JOptionPane.showMessageDialog(null, "Consulta adicionada com sucesso!");
                    } catch (ValidacaoException e) {
                        JOptionPane.showMessageDialog(null, e.getMessage());
                    }
                    break;
                case 2:
                    if (agendaVeterinario.listaConsultas().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Nenhuma consulta cadastrada ainda!");
                    } else {
                        StringBuilder listaConsultas = new StringBuilder();
                        for (Consulta c : agendaVeterinario.listaConsultas()) {
                            listaConsultas.append(c.toString()).append("\n");
                        }
                        JOptionPane.showMessageDialog(null, listaConsultas.toString());
                    }
                    break;
            }
        } while (opcao != 3);
    }
}

