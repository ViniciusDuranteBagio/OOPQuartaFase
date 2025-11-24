import java.util.ArrayList;
import java.util.Scanner;

public class Agenda {

    private static ArrayList<Consulta> agenda = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int opcao;

        do {
            System.out.println("\n--- AGENDA DO VETERINÁRIO ---");
            System.out.println("1 - Listar consultas");
            System.out.println("2 - Cadastrar consulta");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");

            opcao = Integer.parseInt(sc.nextLine());

            if (opcao == 1) listar();
            else if (opcao == 2) cadastrar();

        } while (opcao != 0);

        System.out.println("Encerrando...");
    }

    private static void listar() {
        System.out.println("\n--- CONSULTAS ---");

        if (agenda.isEmpty()) {
            System.out.println("Nenhuma cadastrada ainda.");
            return;
        }

        for (int i = 0; i < agenda.size(); i++) {
            System.out.println((i + 1) + ". " + agenda.get(i));
        }
    }

    private static void cadastrar() {

        if (agenda.size() >= 10) {
            System.out.println("Agenda cheia! Máximo de 10 consultas.");
            return;
        }

        System.out.println("\nTipo de animal (1-Cachorro / 2-Gato / 3-Coelho): ");
        int tipo = Integer.parseInt(sc.nextLine());

        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("Idade: ");
        int idade = Integer.parseInt(sc.nextLine());

        System.out.print("Raça: ");
        String raca = sc.nextLine();

        Animal animal =
                (tipo == 1) ? new Cachorro(nome, idade, raca) :
                        (tipo == 2) ? new Gato(nome, idade, raca) :
                                new Coelho(nome, idade, raca);

        if (!animal.isValido()) {
            System.out.println("Erro: " + animal.getErro());
            return;
        }

        System.out.print("Tipo de atendimento (Banho, Tosa, Banho e Tosa, Consulta): ");
        String atendimento = sc.nextLine();

        String doenca = null;

        if (atendimento.equalsIgnoreCase("Consulta")) {
            String[] lista = animal.getDoencas();

            System.out.println("Escolha a doença:");
            for (int i = 0; i < lista.length; i++) {
                System.out.println((i + 1) + " - " + lista[i]);
            }

            int d = Integer.parseInt(sc.nextLine());
            doenca = lista[d - 1];
        }

        agenda.add(new Consulta(animal, atendimento, doenca));
        System.out.println("Consulta cadastrada com sucesso!");
    }
}
