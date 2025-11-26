import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        Agenda agendaVet = new Agenda();
        Cachorro cachorro = new Cachorro();
        Gato gato = new Gato();
        Coelho coelho = new Coelho();

        while (true) {

            int opcao = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma opção:" +
                    "\n1 - Agendar nova consulta" +
                    "\n2 - Listar todas as consultas"));

            if (opcao == 1) {
                if (agendaVet.agenda.size() >= 10) {
                    JOptionPane.showMessageDialog(null, "Limite máximo de 10 consultas excedidos");
                }
            }
            if (agendaVet.agenda.size() < 10) {
                if (opcao == 1) {
                    int tipoAnimal = Integer.parseInt(JOptionPane.showInputDialog("Qual o tipo do seu animal?" +
                            "\n1 - Cachorro" +
                            "\n2 - Gato" +
                            "\n3 - Coelho"));
                    if (tipoAnimal == 1) {
                        String nomeCachorro = JOptionPane.showInputDialog("Qual o nome do seu cachorro?");
                        cachorro.setnome(nomeCachorro);
                        int idadeCachorro = Integer.parseInt(JOptionPane.showInputDialog("Qual a idade do seu cachorro?"));
                        cachorro.setidade(idadeCachorro);
                        String racaCachorro = JOptionPane.showInputDialog("Qual a raça do seu cachorro?");
                        cachorro.setraca(racaCachorro);
                    }
                    if (tipoAnimal == 2) {
                        String nomeGato = JOptionPane.showInputDialog("Qual o nome do seu gato?");
                        gato.setnome(nomeGato);
                        int idadeGato = Integer.parseInt(JOptionPane.showInputDialog("Qual a idade do gato?"));
                        gato.setidade(idadeGato);
                        String racaGato = JOptionPane.showInputDialog("Qual a raça do seu gato?");
                        gato.setraca(racaGato);
                    }
                    if (tipoAnimal == 3) {
                        String nomeCoelho = JOptionPane.showInputDialog("Qual o nome do seu coelho?");
                        coelho.setnome(nomeCoelho);
                        int idadeCoelho = Integer.parseInt(JOptionPane.showInputDialog("Qual a idade do coelho?"));
                        coelho.setidade(idadeCoelho);
                        String racaCoelho = JOptionPane.showInputDialog("Qual a raça do seu coelho?");
                        coelho.setraca(racaCoelho);
                    }

                    int opcao2 = Integer.parseInt(JOptionPane.showInputDialog("Qual serviço você gostaria de contratar?" +
                            "\n1 - Banho" +
                            "\n2 - Tosa" +
                            "\n3 - Banho e tosa" +
                            "\n4 - Consulta"));

                    if (opcao2 == 1) {
                        if (tipoAnimal == 1) {
                            JOptionPane.showMessageDialog(null, "Nome: " + cachorro.nome +
                                    "\nIdade: " + cachorro.idade +
                                    "\nRaça: " + cachorro.raca +
                                    "\nServiço: Banho" +
                                    "\nPresione 'OK' após confirmar os dados para agendar sua consulta");
                            agendaVet.agenda.add("Um banho agendado para o animal " + cachorro.nome + "\nAnimal: Cachorro\nRaça: " + cachorro.raca + "\n");
                        }
                        if (tipoAnimal == 2) {
                            JOptionPane.showMessageDialog(null, "Nome: " + gato.nome +
                                    "\nIdade: " + gato.idade +
                                    "\nRaça: " + gato.raca +
                                    "\nServiço: Banho" +
                                    "\nPresione 'OK' após confirmar os dados para agendar sua consulta");
                            agendaVet.agenda.add("Um banho agendado para o animal " + gato.nome + "\nAnimal: Gato\nRaça: " + gato.raca + "\n");
                        }
                        if (tipoAnimal == 3) {
                            JOptionPane.showMessageDialog(null, "Nome: " + coelho.nome +
                                    "\nIdade: " + coelho.idade +
                                    "\nRaça: " + coelho.raca +
                                    "\nServiço: Banho" +
                                    "\nPresione 'OK' após confirmar os dados para agendar sua consulta");
                            agendaVet.agenda.add("Um banho agendado para o animal " + coelho.nome + "\nAnimal: Coelho\nRaça: " + coelho.raca + "\n");
                        }
                    } else if (opcao2 == 2) {
                        if (tipoAnimal == 1) {
                            JOptionPane.showMessageDialog(null, "Nome: " + cachorro.nome +
                                    "\nIdade: " + cachorro.idade +
                                    "\nRaça: " + cachorro.raca +
                                    "\nServiço: Tosa" +
                                    "\nPresione 'OK' após confirmar os dados para agendar sua consulta");
                            agendaVet.agenda.add("Uma tosa agendada para o animal " + cachorro.nome + "\nAnimal: Cachorro\nRaça: " + cachorro.raca + "\n");
                        }
                        if (tipoAnimal == 2) {
                            JOptionPane.showMessageDialog(null, "Nome: " + gato.nome +
                                    "\nIdade: " + gato.idade +
                                    "\nRaça: " + gato.raca +
                                    "\nServiço: Tosa" +
                                    "\nPresione 'OK' após confirmar os dados para agendar sua consulta");
                            agendaVet.agenda.add("Uma tosa agendada para o animal " + gato.nome + "\nAnimal: Gato\nRaça: " + gato.raca + "\n");
                        }
                        if (tipoAnimal == 3) {
                            JOptionPane.showMessageDialog(null, "Nome: " + coelho.nome +
                                    "\nIdade: " + coelho.idade +
                                    "\nRaça: " + coelho.raca +
                                    "\nServiço: Tosa" +
                                    "\nPresione 'OK' após confirmar os dados para agendar sua consulta");
                            agendaVet.agenda.add("Uma tosa agendada para o animal " + coelho.nome + "\nAnimal: Coelho\nRaça: " + coelho.raca + "\n");
                        }
                    } else if (opcao2 == 3) {
                        if (tipoAnimal == 1) {
                            JOptionPane.showMessageDialog(null, "Nome: " + cachorro.nome +
                                    "\nIdade: " + cachorro.idade +
                                    "\nRaça: " + cachorro.raca +
                                    "\nServiço: Tosa e banho" +
                                    "\nPresione 'OK' após confirmar os dados para agendar sua consulta");
                            agendaVet.agenda.add("Uma tosa e banho agendada para o animal " + cachorro.nome + "\nAnimal: Cachorro\nRaça: " + cachorro.raca + "\n");
                        }
                        if (tipoAnimal == 2) {
                            JOptionPane.showMessageDialog(null, "Nome: " + gato.nome +
                                    "\nIdade: " + gato.idade +
                                    "\nRaça: " + gato.raca +
                                    "\nServiço: Tosa e banho" +
                                    "\nPresione 'OK' após confirmar os dados para agendar sua consulta");
                            agendaVet.agenda.add("Uma tosa e banho agendada para o animal " + gato.nome + "\nAnimal: Gato\nRaça: " + gato.raca + "\n");
                        }
                        if (tipoAnimal == 3) {
                            JOptionPane.showMessageDialog(null, "Nome: " + coelho.nome +
                                    "\nIdade: " + coelho.idade +
                                    "\nRaça: " + coelho.raca +
                                    "\nServiço: Tosa e banho" +
                                    "\nPresione 'OK' após confirmar os dados para agendar sua consulta");
                            agendaVet.agenda.add("Uma tosa e banho agendada para o animal " + coelho.nome + "\nAnimal: Coelho\nRaça: " + coelho.raca + "\n");
                        }
                    } else if (opcao2 == 4) {
                        String sim = "sim";
                        String nao = "nao";
                        String doenca = JOptionPane.showInputDialog("O seu animal está doente?\nResponda com 'Sim' ou 'Nao'");
                        if (doenca.equalsIgnoreCase(sim)) {
                            if (tipoAnimal == 1) {
                                String doencaDog = JOptionPane.showInputDialog("Qual das doenças abaixo o " + cachorro.nome + " está?"
                                        + "\n" + cachorro.doencas +
                                        "\nCaso a doença não esteja listada ou você não saiba a doença do seu cachorro, deixe em branco e aperte em 'OK'");
                                if (doencaDog == null) {
                                    String doencaCachorro = "Doença não identificada";
                                    JOptionPane.showMessageDialog(null, "Nome: " + cachorro.nome +
                                            "\nIdade: " + cachorro.idade +
                                            "\nRaça: " + cachorro.raca +
                                            "\nDoença: " + doencaCachorro +
                                            "\nPresione 'OK' após confirmar os dados para agendar sua consulta");
                                    agendaVet.agenda.add("Uma consulta agendada para o paciente " + cachorro.nome + "\nAnimal: Cachorro\nRaça: " + cachorro.raca + "\nDoenca: " + doencaCachorro + "\n");
                                } else {
                                    JOptionPane.showMessageDialog(null, "Nome: " + cachorro.nome +
                                            "\nIdade: " + cachorro.idade +
                                            "\nRaça: " + cachorro.raca +
                                            "\nDoença: " + doencaDog +
                                            "\nPresione 'OK' após confirmar os dados para agendar sua consulta");
                                    agendaVet.agenda.add("Uma consulta agendada para o paciente " + cachorro.nome + "\nAnimal: Cachorro\nRaça: " + cachorro.raca + "\nDoenca: " + doencaDog + "\n");
                                }
                            }
                            if (tipoAnimal == 2) {
                                String doencaCat = JOptionPane.showInputDialog("Qual das doenças abaixo o " + gato.nome + " está?"
                                        + "\n" + gato.doencas +
                                        "\nCaso a doença não esteja listada ou você não saiba a doença do seu gato, deixe em branco e aperte em 'OK'");
                                if (doencaCat == null) {
                                    doencaCat = "Doença não identificada";
                                    JOptionPane.showMessageDialog(null, "Nome: " + gato.nome +
                                            "\nIdade: " + gato.idade +
                                            "\nRaça: " + gato.raca +
                                            "\nDoença: " + doencaCat +
                                            "\nPresione 'OK' após confirmar os dados para agendar sua consulta");
                                    agendaVet.agenda.add("Uma consulta agendada para o animal " + gato.nome + "\nAnimal: Gato\nRaça: " + gato.raca + "\nDoenca: " + doencaCat + "\n");
                                } else {
                                    JOptionPane.showMessageDialog(null, "Nome: " + gato.nome +
                                            "\nIdade: " + gato.idade +
                                            "\nRaça: " + gato.raca +
                                            "\nDoença: " + doencaCat +
                                            "\nPresione 'OK' após confirmar os dados para agendar sua consulta");
                                    agendaVet.agenda.add("Uma consulta agendada para o animal " + gato.nome + "\nAnimal: Gato\nRaça: " + gato.raca + "\nDoenca: " + doencaCat + "\n");
                                }
                            }
                            if (tipoAnimal == 3) {
                                String doencaRabbit = JOptionPane.showInputDialog("Qual das doenças abaixo o " + coelho.nome + " está?"
                                        + "\n" + coelho.doencas +
                                        "\nCaso a doença não esteja listada ou você não saiba a doença do seu coelho, deixe em branco e aperte em 'OK'");
                                if (doencaRabbit == null) {
                                    doencaRabbit = "Doença não identificada";
                                    JOptionPane.showMessageDialog(null, "Nome: " + coelho.nome +
                                            "\nIdade: " + coelho.idade +
                                            "\nRaça: " + coelho.raca +
                                            "\nDoença: " + doencaRabbit +
                                            "\nPresione 'OK' após confirmar os dados para agendar sua consulta");
                                    agendaVet.agenda.add("Uma consulta agendada para o animal " + coelho.nome + "\nAnimal: Coelho\nRaça: " + coelho.raca + "\nDoenca: " + doencaRabbit + "\n");
                                } else {
                                    JOptionPane.showMessageDialog(null, "Nome: " + coelho.nome +
                                            "\nIdade: " + coelho.idade +
                                            "\nRaça: " + coelho.raca +
                                            "\nDoença: " + doencaRabbit +
                                            "\nPresione 'OK' após confirmar os dados para agendar sua consulta");
                                    agendaVet.agenda.add("Uma consulta agendada para o animal " + coelho.nome + "\nAnimal: Coelho\nRaça: " + coelho.raca + "\nDoenca: " + doencaRabbit + "\n");
                                }
                            }
                        }
                        if (doenca.equalsIgnoreCase(nao)) {
                            if (tipoAnimal == 1) {
                                JOptionPane.showMessageDialog(null, "Nome: " + cachorro.nome +
                                        "\nIdade: " + cachorro.idade +
                                        "\nRaça: " + cachorro.raca +
                                        "\nDoença: Sem doença" +
                                        "\nPresione 'OK' após confirmar os dados para agendar sua consulta");
                                agendaVet.agenda.add("Uma consulta agendada para o animal " + cachorro.nome + "\nAnimal: Cachorro\nRaça: " + cachorro.raca + "\nDoenca: Sem doença" + "\n");
                            }
                            if (tipoAnimal == 2) {
                                JOptionPane.showMessageDialog(null, "Nome: " + gato.nome +
                                        "\nIdade: " + gato.idade +
                                        "\nRaça: " + gato.raca +
                                        "\nDoença: Doença em branco" +
                                        "\nPresione 'OK' após confirmar os dados para agendar sua consulta");
                                agendaVet.agenda.add("Uma consulta agendada para o animal " + gato.nome + "\nAnimal: Gato\nRaça: " + gato.raca + "\nDoenca: Sem doença" + "\n");
                            }
                            if (tipoAnimal == 3) {
                                JOptionPane.showMessageDialog(null, "Nome: " + coelho.nome +
                                        "\nIdade: " + coelho.idade +
                                        "\nRaça: " + coelho.raca +
                                        "\nDoença: Doença em branco" +
                                        "\nPresione 'OK' após confirmar os dados para agendar sua consulta");
                                agendaVet.agenda.add("Uma consulta agendada para o animal " + coelho.nome + "\nAnimal: Coelho\nRaça: " + coelho.raca + "\nDoenca: Sem doença" + "\n");
                            }
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Escolha uma opção válida");
                    }
                }
            }
            if (opcao == 2) {
                JOptionPane.showMessageDialog(null, agendaVet.agenda);
            }
        }
    }
}