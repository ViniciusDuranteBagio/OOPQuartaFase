import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AgendaVeterinario agenda = new AgendaVeterinario();

        while (true) {
            System.out.println("\n=== Agenda do Veterinário ===");
            System.out.println("1 - Listar consultas");
            System.out.println("2 - Cadastrar consulta");
            System.out.println("3 - Sair");
            System.out.print("Escolha: ");

            int opcao = Integer.parseInt(sc.nextLine());

            if (opcao == 3) break;

            switch (opcao) {
                case 1:
                    agenda.listar();
                    break;

                case 2:
                    try {
                        Consulta c = cadastrar(sc);
                        agenda.adicionar(c);
                        System.out.println("Consulta cadastrada!");
                    } catch (ValidacaoException e) {
                        System.out.println("Erro: " + e.getMessage());
                    }
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        }

        System.out.println("Sistema encerrado.");
        sc.close();
    }

    private static Consulta cadastrar(Scanner sc) throws ValidacaoException {

        System.out.print("Tipo de animal (1 - Cachorro, 2 - Gato, 3 - Coelho): ");
        int tipoAnimal = Integer.parseInt(sc.nextLine());

        System.out.print("Nome: ");
        String nome = sc.nextLine();
        if (!nome.matches("[A-Za-z ]{2,}")) {
            throw new ValidacaoException("Nome inválido.");
        }

        System.out.print("Idade: ");
        int idade = Integer.parseInt(sc.nextLine());
        if (idade <= 0) {
            throw new ValidacaoException("Idade deve ser maior que zero.");
        }

        System.out.print("Raça: ");
        String raca = sc.nextLine();
        if (raca.isEmpty()) {
            throw new ValidacaoException("Raça não pode ficar em branco.");
        }

        Animal animal;
        switch (tipoAnimal) {
            case 1: animal = new Cachorro(nome, idade, raca); break;
            case 2: animal = new Gato(nome, idade, raca); break;
            case 3: animal = new Coelho(nome, idade, raca); break;
            default: throw new ValidacaoException("Tipo de animal inválido.");
        }

        System.out.println("Tipo de atendimento:");
        System.out.println("1 - Banho");
        System.out.println("2 - Tosa");
        System.out.println("3 - Banho e Tosa");
        System.out.println("4 - Consulta");
        int tipoAt = Integer.parseInt(sc.nextLine());

        String atendimento;
        switch (tipoAt) {
            case 1: atendimento = "Banho"; break;
            case 2: atendimento = "Tosa"; break;
            case 3: atendimento = "Banho e Tosa"; break;
            case 4: atendimento = "Consulta"; break;
            default: throw new ValidacaoException("Atendimento inválido.");
        }

        String doenca = null;

        if (atendimento.equals("Consulta")) {
            String[] lista = animal.getDoencas();
            System.out.println("Escolha a doença:");

            for (int i = 0; i < lista.length; i++) {
                System.out.println((i + 1) + " - " + lista[i]);
            }

            int esc = Integer.parseInt(sc.nextLine());
            if (esc < 1 || esc > lista.length) {
                throw new ValidacaoException("Doença inválida.");
            }

            doenca = lista[esc - 1];
        }

        return new Consulta(animal, atendimento, doenca);
    }
}
