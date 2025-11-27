package Aula1.Exercicio;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        int opcao = -1;
        Scanner scanner = new Scanner(System.in);

        while (opcao != 0) {
            System.out.println("=== MENU ===");
            System.out.println("1 - Listar consultas");
            System.out.println("2 - Cadastrar consulta");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine(); // limpar buffer

            if (opcao == 1) {
                System.out.println("=== CONSULTAS CADASTRADAS ===");

                if (agenda.getConsultas().isEmpty()) {
                    System.out.println("Nenhuma cadastrada ainda.");
                } else {
                    for (Consulta c : agenda.getConsultas()) {
                        System.out.println(c);
                    }
                }

            } else if (opcao == 2) {

                try {
                    System.out.print("Tipo de animal (1-Cachorro, 2-Gato, 3-Coelho): ");
                    int tipo = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();

                    System.out.print("Idade: ");
                    int idade = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Raça: ");
                    String raca = scanner.nextLine();

                    Animal animal = null;

                    switch (tipo) {
                        case 1 -> animal = new Cachorro(nome, idade, raca);
                        case 2 -> animal = new Gato(nome, idade, raca);
                        case 3 -> animal = new Coelho(nome, idade, raca);
                        default -> System.out.println("Tipo inválido.");
                    }

                    System.out.println("Tipo de atendimento: Banho | Tosa | Banho e Tosa | Consulta");
                    String atendimento = scanner.nextLine();

                    String doenca = null;

                    if (atendimento.equalsIgnoreCase("Consulta")) {
                        boolean doencaValida = false;

                        while (!doencaValida) {
                            System.out.print("Animal está doente? (s/n): ");
                            String resp = scanner.nextLine();

                            if (resp.equalsIgnoreCase("s")) {
                                System.out.println("Doenças possíveis:");
                                for (String d : animal.getDoencasPossiveis()) {
                                    System.out.println("- " + d);
                                }

                                System.out.print("Informe a doença: ");
                                doenca = scanner.nextLine();

                                for (String d : animal.getDoencasPossiveis()) {
                                    if (d.equalsIgnoreCase(doenca)) {
                                        doencaValida = true;
                                        break;
                                    }
                                }

                                if (!doencaValida) {
                                    System.out.println("Doença inválida para este animal. Tente novamente.\n");
                                }
                            } else {
                                doencaValida = true;
                            }
                        }
                    }

                    Consulta consulta = new Consulta(animal, atendimento, doenca);
                    agenda.adicionarConsulta(consulta);

                    System.out.println("Consulta cadastrada com sucesso!\n");

                } catch (ValidacaoException e) {
                    System.out.println("Erro: " + e.getMessage());
                }
            }
        }

        scanner.close();
    }
}
