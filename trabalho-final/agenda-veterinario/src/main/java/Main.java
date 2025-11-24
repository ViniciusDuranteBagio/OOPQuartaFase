import animal.*;
import consulta.*;
import agenda.Agenda;
import validacao.*;

import java.util.List;
import java.util.Scanner;

public class Main {

    static Agenda agenda = new Agenda();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        boolean rodando = true;

        while (rodando) {
            System.out.println("\n=== AGENDA VETERINÁRIA ===");
            System.out.println("1 - Listar consultas");
            System.out.println("2 - Cadastrar consulta");
            System.out.println("0 - Sair");
            System.out.print("> ");

            String opcao = scanner.nextLine();

            switch (opcao) {
                case "1":
                    listarConsultas();
                    break;

                case "2":
                    cadastrarConsulta();
                    break;

                case "0":
                    System.out.println("Encerrando...");
                    rodando = false;
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        }
    }

    private static void listarConsultas() {
        List<Consulta> consultas = agenda.listar();

        if (consultas.isEmpty()) {
            System.out.println("Nenhuma consulta cadastrada.");
            return;
        }

        int i = 1;
        for (Consulta c : consultas) {
            System.out.println(i++ + ") " + c);
        }
    }

    private static void cadastrarConsulta() {
        try {
            System.out.print("Tipo de animal (1-Cachorro, 2-Gato, 3-Coelho): ");
            String tipoAnimal = scanner.nextLine();

            System.out.print("Nome do animal: ");
            String nome = scanner.nextLine();
            ValidacaoUtils.validarNome(nome);

            System.out.print("Idade do animal: ");
            int idade = Integer.parseInt(scanner.nextLine());
            ValidacaoUtils.validarIdade(idade);

            System.out.print("Raça do animal: ");
            String raca = scanner.nextLine();
            ValidacaoUtils.validarRaca(raca);

            Animal animal;
            switch (tipoAnimal) {
                case "1":
                    animal = new Cachorro(nome, idade, raca);
                    break;
                case "2":
                    animal = new Gato(nome, idade, raca);
                    break;
                case "3":
                    animal = new Coelho(nome, idade, raca);
                    break;
                default:
                    System.out.println("Tipo inválido.");
                    return;
            }

            System.out.println("Tipo de atendimento:");
            System.out.println("1 - Banho");
            System.out.println("2 - Tosa");
            System.out.println("3 - Banho e Tosa");
            System.out.println("4 - Consulta");
            System.out.print("> ");

            String tipo = scanner.nextLine();
            Consulta.TipoAtendimento atendimento;

            switch (tipo) {
                case "1": atendimento = Consulta.TipoAtendimento.BANHO; break;
                case "2": atendimento = Consulta.TipoAtendimento.TOSA; break;
                case "3": atendimento = Consulta.TipoAtendimento.BANHO_TOSA; break;
                case "4": atendimento = Consulta.TipoAtendimento.CONSULTA; break;
                default:
                    System.out.println("Tipo inválido.");
                    return;
            }

            String doenca = null;

            if (atendimento == Consulta.TipoAtendimento.CONSULTA) {
                System.out.print("O animal está doente (s/n)? ");
                if (scanner.nextLine().equalsIgnoreCase("s")) {
                    System.out.print("Informe a doença: ");
                    doenca = scanner.nextLine();

                    if (!animal.possuiDoenca(doenca)) {
                        System.out.println("Doença inválida para esse animal.");
                        return;
                    }
                }
            }

            Consulta consulta = new Consulta(animal, atendimento, doenca);
            agenda.adicionar(consulta);

            System.out.println("Consulta cadastrada com sucesso!");

        } catch (ValidacaoException e) {
            System.out.println("Erro: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Entrada inválida.");
        }
    }
}
