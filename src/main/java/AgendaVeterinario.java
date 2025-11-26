import java.util.Scanner;

public class AgendaVeterinario {

    private static final Scanner sc = new Scanner(System.in);
    private static final Agenda agenda = new Agenda();

    public static void main(String[] args) {
        System.out.println("=== Sistema de Agenda do Veterinário (Console) ===");
        boolean sair = false;
        while (!sair) {
            try {
                System.out.println();
                System.out.println("1 - Listar consultas");
                System.out.println("2 - Cadastrar consulta");
                System.out.println("0 - Sair");
                System.out.print("Opção: ");
                String opc = sc.nextLine().trim();

                switch (opc) {
                    case "1" -> listar();
                    case "2" -> cadastrar();
                    case "0" -> sair = true;
                    default -> System.out.println("Opção inválida.");
                }

            } catch (Exception e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }
    }

    private static void listar() {
        System.out.println("\n--- Consultas ---");
        if (agenda.estaVazia()) {
            System.out.println("Nenhuma cadastrada ainda.");
        } else {
            String[] lista = agenda.gerarListaStrings();
            for (int i = 0; i < lista.length; i++) {
                System.out.printf("%d) %s%n", i + 1, lista[i]);
            }
        }
        System.out.println("\nPressione ENTER para voltar...");
        sc.nextLine();
    }

    private static void cadastrar() {
        try {
            System.out.println("\n1 - Cachorro");
            System.out.println("2 - Gato");
            System.out.println("3 - Coelho");
            System.out.print("Animal: ");
            String tipo = sc.nextLine().trim();

            System.out.print("Nome: ");
            String nome = sc.nextLine();
            Validador.conferirNome(nome);

            System.out.print("Idade: ");
            int idade = Integer.parseInt(sc.nextLine());
            Validador.conferirIdade(idade);

            System.out.print("Raça: ");
            String raca = sc.nextLine();
            if (raca == null || raca.isBlank()) throw new ValidacaoException("Raça deve ser informada.");

            Animal animal = switch (tipo) {
                case "1" -> new Cachorro(nome, idade, raca);
                case "2" -> new Gato(nome, idade, raca);
                default -> new Coelho(nome, idade, raca);
            };

            System.out.println("\n1 - Banho");
            System.out.println("2 - Tosa");
            System.out.println("3 - Banho e Tosa");
            System.out.println("4 - Consulta");
            System.out.print("Atendimento: ");
            String at = sc.nextLine().trim();

            String atendimento = switch (at) {
                case "1" -> "Banho";
                case "2" -> "Tosa";
                case "3" -> "Banho e Tosa";
                case "4" -> "Consulta";
                default -> throw new ValidacaoException("Tipo de atendimento inválido.");
            };

            String doenca = null;
            if (atendimento.equals("Consulta")) {
                System.out.print("Está doente? (s/n): ");
                String resp = sc.nextLine().trim().toLowerCase();
                if (resp.startsWith("s")) {
                    String[] possiveis = animal.doencas();
                    System.out.println("\nDoenças possíveis:");
                    for (int i = 0; i < possiveis.length; i++) {
                        System.out.printf("%d - %s%n", i + 1, possiveis[i]);
                    }
                    System.out.print("Escolha a doença (número): ");
                    int escolha = Integer.parseInt(sc.nextLine());
                    if (escolha < 1 || escolha > possiveis.length) throw new ValidacaoException("Escolha inválida.");
                    doenca = possiveis[escolha - 1];
                }
            }

            agenda.inserir(new Consulta(animal, atendimento, doenca));
            System.out.println("Cadastro concluído!");

        } catch (ValidacaoException e) {
            System.out.println("Validação: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Entrada numérica inválida.");
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}