import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Agenda agenda = new Agenda();
        int opc;

        while (true) {
            System.out.println("\n--- AGENDA VETERINÁRIA ---");
            System.out.println("1 - Listar consultas");
            System.out.println("2 - Cadastrar consulta");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opc = Integer.parseInt(sc.nextLine());

            switch (opc) {
                case 1 -> {
                    if (agenda.vazia()) {
                        System.out.println("Nenhuma cadastrada ainda.");
                    } else {
                        System.out.println("\n--- CONSULTAS ---");
                        for (Consulta c : agenda.listar()) {
                            System.out.println(c);
                        }
                        System.out.println("Pressione ENTER para voltar...");
                        sc.nextLine();
                    }
                }

                case 2 -> {
                    try {
                        System.out.println("Tipo de animal (1 - Cachorro, 2 - Gato, 3 - Coelho): ");
                        int ta = Integer.parseInt(sc.nextLine());

                        System.out.print("Nome: ");
                        String nome = sc.nextLine();
                        System.out.print("Idade: ");
                        int idade = Integer.parseInt(sc.nextLine());
                        System.out.print("Raça: ");
                        String raca = sc.nextLine();

                        Animal animal = switch (ta) {
                            case 1 -> new Cachorro(nome, idade, raca);
                            case 2 -> new Gato(nome, idade, raca);
                            case 3 -> new Coelho(nome, idade, raca);
                            default -> throw new ValidacaoException("Tipo inválido!");
                        };

                        System.out.println("Tipo de atendimento: Banho, Tosa, Banho e Tosa, Consulta");
                        String tipo = sc.nextLine();
                        String doenca = null;

                        if (tipo.equalsIgnoreCase("Consulta")) {
                            System.out.print("Animal está doente? (s/n): ");
                            if (sc.nextLine().equalsIgnoreCase("s")) {
                                String[] doenças = animal.getDoencasPossiveis();
                                System.out.println("Escolha uma doença:");
                                for (int i = 0; i < doenças.length; i++) {
                                    System.out.println((i + 1) + " - " + doenças[i]);
                                }
                                int d = Integer.parseInt(sc.nextLine());
                                doenca = doenças[d - 1];
                            }
                        }

                        Consulta c = new Consulta(animal, tipo, doenca);
                        agenda.adicionar(c);

                        System.out.println("Consulta cadastrada com sucesso!");

                    } catch (Exception e) {
                        System.out.println("Erro: " + e.getMessage());
                    }
                }

                case 0 -> {
                    System.out.println("Encerrando...");
                    return;
                }

                default -> System.out.println("Opção inválida!");
            }
        }
    }
}