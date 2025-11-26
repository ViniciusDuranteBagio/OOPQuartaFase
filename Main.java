import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        AgendaVeterinario agendaVeterinario = new AgendaVeterinario();
        int opcao = 0;

        do {
            String menu = """
                    -----MENU-----
                    1- AGENDAR CONSULTAS
                    2- LISTAR CONSULTAS
                    3- SAIR
                    """;
            String input = JOptionPane.showInputDialog(menu);
            if (input == null) {
                break;
            }

            try {
                opcao = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Digite apenas numeros (1, 2 ou 3)");
                continue;
            }

            if (opcao < 1 || opcao > 3) {
                JOptionPane.showMessageDialog(null, "Opcao invalida!\n" + "Escolha: 1, 2 ou 3");
                continue;
            }

            switch (opcao) {
                case 1:
                    try {
                        int tipoAnimal;

                        while (true) {
                            String tipoAnimalString = JOptionPane.showInputDialog("Tipo de animal:\n 1- Cachorro\n 2- Gato\n 3- Coelho");
                            if (tipoAnimalString == null) {
                                return;
                            }

                            try {
                                tipoAnimal = Integer.parseInt(tipoAnimalString);
                            } catch (NumberFormatException e) {
                                JOptionPane.showMessageDialog(null, "Digite apenas numeros (1, 2 ou 3)");
                                continue;
                            }

                            if (tipoAnimal < 1 || tipoAnimal > 3) {
                                JOptionPane.showMessageDialog(null, "Opcao invalida!\n" + "Escolha: 1, 2 ou 3");
                                continue;
                            }
                            break;
                        }

                        String name;
                        while (true) {
                            name = JOptionPane.showInputDialog("Nome do animal:");
                            if (name == null) {
                                JOptionPane.showMessageDialog(null, "O nome e obrigatorio.");
                                continue;
                            }
                            name = name.trim();

                            if (name.length() < 2) {
                                JOptionPane.showMessageDialog(null, "O nome deve ter pelo menos dois caracteres");
                            } else if (!name.matches("^[\\p{L} ]+$")) {
                                JOptionPane.showMessageDialog(null, "O nome deve conter apenas letras");
                            } else {
                                break;
                            }
                        }

                        int age;
                        while (true) {
                            String ageString = JOptionPane.showInputDialog("Idade do animal:");
                            if (ageString == null) {
                                JOptionPane.showMessageDialog(null, "A idade e obrigatoria.");
                                continue;
                            }
                            try {
                                age = Integer.parseInt(ageString);
                                if (age <= 0) {
                                    JOptionPane.showMessageDialog(null, "A idade deve ser maior que 0.");
                                } else {
                                    break;
                                }
                            } catch (NumberFormatException e) {
                                JOptionPane.showMessageDialog(null, "Digite apenas numeros para a idade");
                            }
                        }

                        String breed;
                        while (true) {
                            String breedString = JOptionPane.showInputDialog("Raca do animal:");
                            if (breedString == null) {
                                JOptionPane.showMessageDialog(null, "A raca e obrigatoria.");
                                continue;
                            }
                            breed = breedString.trim();
                            if (breed.isEmpty()) {
                                JOptionPane.showMessageDialog(null, "A raca deve ser informada.");
                            } else if (!breed.matches("^[\\p{L} ]+$")) {
                                JOptionPane.showMessageDialog(null, "A raca deve conter apenas letras");
                            } else {
                                break;
                            }
                        }

                        Animal animal = null;
                        switch (tipoAnimal) {
                            case 1 -> animal = new Cachorro(name, age, breed);
                            case 2 -> animal = new Gato(name, age, breed);
                            case 3 -> animal = new Coelho(name, age, breed);
                            default -> JOptionPane.showMessageDialog(null, "Opcao invalida!");
                        }

                        int opcaoAtendimento;

                        while (true) {
                            String tipoAtendimentoString = JOptionPane.showInputDialog("""
                                    Tipo de atendimento:
                                    1 - Exame
                                    2 - Banho
                                    3 - Tosa
                                    4 - Consulta
                                    """);
                            if (tipoAtendimentoString == null) {
                                return;
                            }

                            try {
                                opcaoAtendimento = Integer.parseInt(tipoAtendimentoString);
                            } catch (NumberFormatException e) {
                                JOptionPane.showMessageDialog(null, "Digite apenas numeros (1, 2, 3 ou 4)");
                                continue;
                            }

                            if (opcaoAtendimento < 1 || opcaoAtendimento > 4) {
                                JOptionPane.showMessageDialog(null, "Opcao invalida!\n" + "Escolha: 1, 2, 3 ou 4");
                                continue;
                            }
                            break;
                        }

                        String tipoAtendimento = switch (opcaoAtendimento) {
                            case 1 -> "Exame";
                            case 2 -> "Banho";
                            case 3 -> "Tosa";
                            case 4 -> "Consulta";
                            default -> "Desconhecido";
                        };

                        String disease = null;
                        if (opcaoAtendimento == 4) {
                            while (true) {
                                String estaDoente = JOptionPane.showInputDialog("O animal esta doente? (s/n)");
                                if (estaDoente == null) {
                                    JOptionPane.showMessageDialog(null, "Resposta obrigatoria. Informe 's' ou 'n'.");
                                    continue;
                                }

                                estaDoente = estaDoente.trim().toLowerCase();

                                if (estaDoente.equals("s")) {
                                    disease = animal.escolherDoenca();
                                    break;
                                } else if (estaDoente.equals("n")) {
                                    disease = null;
                                    break;
                                } else {
                                    JOptionPane.showMessageDialog(null, "Digite apenas 's' para sim ou 'n' para nao.");
                                }
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
                        JOptionPane.showMessageDialog(null, "Nenhuma consulta cadastrada!");
                    } else {
                        StringBuilder listaConsultas = new StringBuilder();
                        for (Consulta c : agendaVeterinario.listaConsultas()) {
                            listaConsultas.append(c.toString()).append("\n");
                        }
                        JOptionPane.showMessageDialog(null, listaConsultas.toString());
                    }
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Saindo do sistema...");
                    break;
            }
        } while (opcao != 3);
    }
}

