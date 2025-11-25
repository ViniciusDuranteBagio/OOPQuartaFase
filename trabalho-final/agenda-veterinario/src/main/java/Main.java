import animal.*;
import consulta.*;
import agenda.Agenda;
import validacao.*;

import java.util.List;
import java.util.Scanner;

public class Main {

    private static final Agenda agenda = new Agenda();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean rodando = true;

        while (rodando) {
            System.out.println("\n=== AGENDA VETERINÁRIA ===");
            System.out.println("1 - Listar consultas");
            System.out.println("2 - Cadastrar consulta");
            System.out.println("0 - Sair");
            System.out.print("> ");
            String opcao = scanner.nextLine().trim();

            switch (opcao) {
                case "1":
                    listarConsultas();
                    break;
                case "2":
                    cadastrarConsulta();
                    break;
                case "0":
                    rodando = false;
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }

        scanner.close();
    }

    private static void listarConsultas() {
        List<Consulta> consultas = agenda.listar();

        if (consultas == null || consultas.isEmpty()) {
            System.out.println("Nenhuma cadastrada ainda");
            System.out.println("Pressione ENTER para voltar.");
            scanner.nextLine();
            return;
        }

        System.out.println("\nConsultas cadastradas:");
        int i = 1;
        for (Consulta c : consultas) {
            System.out.println(i++ + ") " + c);
        }

        System.out.println("\nPressione ENTER para voltar.");
        scanner.nextLine();
    }

    private static void cadastrarConsulta() {
        try {
            System.out.println("Tipo de animal:");
            System.out.println("1 - Cachorro");
            System.out.println("2 - Gato");
            System.out.println("3 - Coelho");
            System.out.print("> ");
            String tipoAnimal = scanner.nextLine().trim();

            if (!tipoAnimal.matches("[123]")) {
                System.out.println("Tipo de animal inválido.");
                return;
            }

            System.out.print("Nome do animal: ");
            String nome = scanner.nextLine();
            ValidacaoUtils.validarNome(nome);

            System.out.print("Idade do animal: ");
            String idadeStr = scanner.nextLine().trim();
            int idade = Integer.parseInt(idadeStr);
            ValidacaoUtils.validarIdade(idade);

            System.out.print("Raça do animal: ");
            String raca = scanner.nextLine();
            ValidacaoUtils.validarRaca(raca);

            Animal animal;
            switch (tipoAnimal) {
                case "1": animal = new Cachorro(nome, idade, raca); break;
                case "2": animal = new Gato(nome, idade, raca); break;
                default:  animal = new Coelho(nome, idade, raca); break;
            }

            System.out.println("Tipo de atendimento:");
            System.out.println("1 - Banho");
            System.out.println("2 - Tosa");
            System.out.println("3 - Banho e Tosa");
            System.out.println("4 - Consulta");
            System.out.print("> ");
            String tipoAt = scanner.nextLine().trim();

            Consulta.TipoAtendimento tipo;
            switch (tipoAt) {
                case "1": tipo = Consulta.TipoAtendimento.BANHO; break;
                case "2": tipo = Consulta.TipoAtendimento.TOSA; break;
                case "3": tipo = Consulta.TipoAtendimento.BANHO_TOSA; break;
                case "4": tipo = Consulta.TipoAtendimento.CONSULTA; break;
                default:
                    System.out.println("Tipo de atendimento inválido.");
                    return;
            }

            String doenca = null;

            if (tipo == Consulta.TipoAtendimento.CONSULTA) {
                System.out.print("O animal está doente? (s/n): ");
                String resp = scanner.nextLine().trim();

                if (resp.equalsIgnoreCase("s")) {
                    while (true) {
                        System.out.print("Informe a doença (ou ENTER para cancelar): ");
                        String entrada = scanner.nextLine().trim();

                        if (entrada.isEmpty()) return;

                        if (animal.possuiDoenca(entrada)) {
                            doenca = entrada;
                            break;
                        } else {
                            System.out.println("Doença inválida para esse tipo de animal.");
                            System.out.print("Tentar novamente? (s/n): ");
                            if (!scanner.nextLine().trim().equalsIgnoreCase("s")) return;
                        }
                    }
                }
            }

            Consulta consulta = new Consulta(animal, tipo, doenca);
            agenda.adicionar(consulta);
            System.out.println("Consulta cadastrada com sucesso!");

        } catch (ValidacaoException ve) {
            System.out.println("Erro: " + ve.getMessage());
        } catch (Exception e) {
            System.out.println("Entrada inválida.");
        }
    }
}
