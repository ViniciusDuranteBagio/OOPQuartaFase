import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        AgendaVeterinario agenda = new AgendaVeterinario();
        int opcao = -1;

        while (opcao != 3) {

            System.out.println("\n=== MENU ===");
            System.out.println("1 - Listar atendimentos");
            System.out.println("2 - Cadastrar atendimento");
            System.out.println("3 - Sair");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    listar(agenda);
                    break;
                case 2:
                    cadastrar(agenda, sc);
                    break;
                case 3:
                    System.out.println("\nEncerrando...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
        sc.close();
    }

    private static void listar(AgendaVeterinario agenda) {
        if (agenda.estaVazia()) {
            System.out.println("\nNenhum atendimento cadastrado.");
            return;
        }

        System.out.println("\n=== LISTA DE ATENDIMENTOS ===");
        for (Atendimento a : agenda.listarAtendimentos()) {
            System.out.println(a.gerarResumo());
        }
    }

    private static void cadastrar(AgendaVeterinario agenda, Scanner sc) {

        try {
            System.out.println("\n=== Cadastro de Atendimento ===");

            System.out.println("Escolha o tipo do animal:");
            System.out.println("1 - Cachorro");
            System.out.println("2 - Gato");
            System.out.println("3 - Coelho");
            System.out.print("Opção: ");
            int tipoAnimal = sc.nextInt();
            sc.nextLine();

            System.out.print("Nome do animal: ");
            String nome = sc.nextLine();
            Validadores.validarNome(nome);

            System.out.print("Idade do animal: ");
            String idadeStr = sc.nextLine();
            int idade = Validadores.validarIdade(idadeStr);

            System.out.print("Raça do animal: ");
            String raca = sc.nextLine();
            Validadores.validarRaca(raca);

            Animal animal;

            if (tipoAnimal == 1) animal = new Cachorro(nome, idade, raca);
            else if (tipoAnimal == 2) animal = new Gato(nome, idade, raca);
            else animal = new Coelho(nome, idade, raca);

            System.out.println("\nTipo de atendimento:");
            System.out.println("1 - Banho");
            System.out.println("2 - Tosa");
            System.out.println("3 - Banho e Tosa");
            System.out.println("4 - Consulta");
            System.out.print("Opção: ");
            int tipo = sc.nextInt();
            sc.nextLine();

            String tipoAtendimento = "";
            switch (tipo) {
                case 1: tipoAtendimento = "Banho"; break;
                case 2: tipoAtendimento = "Tosa"; break;
                case 3: tipoAtendimento = "Banho e Tosa"; break;
                case 4:
                    tipoAtendimento = "Consulta";
                    animal.setEstaDoente(true);

                    String[] doencas = animal.getPossiveisDoencas();
                    System.out.println("\nSelecione a doença:");

                    for (int i = 0; i < doencas.length; i++) {
                        System.out.println((i + 1) + " - " + doencas[i]);
                    }

                    System.out.print("Opção: ");
                    int d = sc.nextInt();
                    sc.nextLine();

                    if (d >= 1 && d <= doencas.length) {
                        animal.setDoenca(doencas[d - 1]);
                    }
                    break;

                default:
                    System.out.println("Atendimento inválido.");
                    return;
            }

            String horario = agenda.gerarHorario();

            Atendimento atendimento = new Atendimento(animal, tipoAtendimento, horario);

            agenda.adicionarAtendimento(atendimento);

            System.out.println("\nAtendimento cadastrado com sucesso!");

        } catch (Exception erro) {
            System.out.println("\nErro: " + erro.getMessage());
        }
    }
}