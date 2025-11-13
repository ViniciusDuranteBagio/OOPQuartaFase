package org.example;

import java.util.List;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Agenda agenda = new Agenda();

    int opcao;

    do {
      System.out.println("==== AGENDA VETERINÁRIA ====");
      System.out.println("1 - Listar consultas");
      System.out.println("2 - Cadastrar consulta");
      System.out.println("3 - Sair");
      System.out.print("Escolha uma opção: ");

      opcao = lerInteiro(sc);

      switch (opcao) {
        case 1:
          listarConsultas(agenda, sc);
          break;
        case 2:
          cadastrarConsulta(agenda, sc);
          break;
        case 3:
          System.out.println("Encerrando o sistema...");
          break;
        default:
          System.out.println("Opção inválida. Tente novamente.\n");
      }

    } while (opcao != 3);

    sc.close();
  }

  private static void listarConsultas(Agenda agenda, Scanner sc) {
    System.out.println("\n=== LISTAGEM DE CONSULTAS ===");

    if (!agenda.possuiConsultas()) {
      System.out.println("Nenhuma cadastrada ainda.\n");
      return;
    }

    for (int i = 0; i < agenda.getTotalConsultas(); i++) {
      System.out.println((i + 1) + " - " + agenda.getConsultas()[i]);
    }

    System.out.println("\nPressione ENTER para voltar ao menu.");
    sc.nextLine();
    sc.nextLine();
  }

  private static void cadastrarConsulta(Agenda agenda, Scanner sc) {
    try {
      System.out.println("\n=== CADASTRAR CONSULTA ===");

      System.out.println("Tipo de animal:");
      System.out.println("1 - Cachorro");
      System.out.println("2 - Gato");
      System.out.println("3 - Coelho");
      System.out.print("Escolha: ");
      int tipoAnimal = lerInteiro(sc);

      sc.nextLine();

      System.out.print("Nome do animal: ");
      String nome = sc.nextLine();

      System.out.print("Idade do animal (em anos): ");
      int idade = lerInteiro(sc);
      sc.nextLine();

      System.out.print("Raça do animal: ");
      String raca = sc.nextLine();

      Animal animal;
      switch (tipoAnimal) {
        case 1:
          animal = new Cachorro(nome, idade, raca);
          break;
        case 2:
          animal = new Gato(nome, idade, raca);
          break;
        case 3:
          animal = new Coelho(nome, idade, raca);
          break;
        default:
          throw new ValidacaoException("Tipo de animal inválido.");
      }

      System.out.println("\nTipo de atendimento:");
      System.out.println("1 - Banho");
      System.out.println("2 - Tosa");
      System.out.println("3 - Banho e Tosa");
      System.out.println("4 - Consulta");
      System.out.print("Escolha: ");
      int opcAtend = lerInteiro(sc);

      TipoAtendimento tipoAtendimento = TipoAtendimento.fromOpcao(opcAtend);

      String doenca = null;

      if (tipoAtendimento == TipoAtendimento.CONSULTA) {
        sc.nextLine();
        System.out.print("O animal está doente? (s/n): ");
        String resp = sc.nextLine().trim().toLowerCase();

        if (resp.equals("s")) {
          List<String> doencas = animal.getDoencasComuns();
          System.out.println("Doenças comuns para " +
                  animal.getClass().getSimpleName() + ":");
          for (int i = 0; i < doencas.size(); i++) {
            System.out.println((i + 1) + " - " + doencas.get(i));
          }
          System.out.print("Escolha a doença pelo número: ");
          int opcDoenca = lerInteiro(sc);

          if (opcDoenca < 1 || opcDoenca > doencas.size()) {
            throw new ValidacaoException("Doença inválida para este animal.");
          }
          doenca = doencas.get(opcDoenca - 1);
        }
      }

      Consulta consulta = new Consulta(animal, tipoAtendimento, doenca);
      agenda.adicionarConsulta(consulta);

      System.out.println("\nConsulta cadastrada com sucesso!\n");

    } catch (ValidacaoException e) {
      System.out.println("Erro de validação: " + e.getMessage() + "\n");
    }
  }

  private static int lerInteiro(Scanner sc) {
    while (!sc.hasNextInt()) {
      System.out.print("Valor inválido. Digite um número inteiro: ");
      sc.next();
    }
    return sc.nextInt();
  }
}
