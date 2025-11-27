import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    Agenda agenda = new Agenda();

    int opcao = 0;

    ///////////////////////////////////////////////////////////////////
    /////////////////////// MENU PRINCIPAL ////////////////////////////
    ///////////////////////////////////////////////////////////////////

    do {
      System.out.println("\n=== MENU ===");
      System.out.println("1 - Cadastrar Nova Consulta - (" + agenda.getConsultasCadastradas() + "/10)");
      System.out.println("2 - Listar Consultas");
      System.out.println("3 - Sair");
      System.out.println("\nEscolha uma opção:");
      opcao = Integer.parseInt(scanner.nextLine());

      switch (opcao) {

        case 1:

          ///////////////////////////////////////////////////////////////////
          //////////////////////// Tipo de Animal ///////////////////////////
          ///////////////////////////////////////////////////////////////////

          System.out.println("\n--- Cadastro de Consulta ---");
          System.out.println("Selecione o tipo de animal:");
          System.out.println("1 - Cachorro");
          System.out.println("2 - Gato");
          System.out.println("3 - Coelho");
          System.out.println("Escolha: ");
          int tipoAnimal = Integer.parseInt(scanner.nextLine());

          //Cria o objeto Animal
          Animal animal = null;

          try {

            System.out.print("Nome do animal: ");
            String nome = scanner.nextLine();

            System.out.print("Idade do animal: ");
            int idade = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Raça do animal: ");
            String raca = scanner.nextLine();

            switch (tipoAnimal) {
              case 1: {
                animal = new Cachorro(nome, idade, raca);
                break;
              }

              case 2: {
                animal = new Gato(nome, idade, raca);
                break;
              }

              case 3: {
                animal = new Coelho(nome, idade, raca);
                break;
              }

              default:
                System.out.println("Tipo inválido!");
                return;
            }
          } catch (ValidacaoException e) {
            //usando getmessage ensinado durante as aulas
            System.out.println("Erro ao criar animal: " + e.getMessage());
            return;
          }
          ///////////////////////////////////////////////////////////////////
          ///////////////////// Tipo de Atendimento /////////////////////////
          ///////////////////////////////////////////////////////////////////

          System.out.println("\nTipos de Atendimento:");
          System.out.println("1 - Banho");
          System.out.println("2 - Tosa");
          System.out.println("3 - Banho e Tosa");
          System.out.println("4 - Consulta");
          System.out.print("Escolha o tipo de atendimento: ");
          int opcaoAtendimento = Integer.parseInt(scanner.nextLine());

          String tipoAtendimento = "";

          switch (opcaoAtendimento) {
            case 1:
              tipoAtendimento = "Banho";
              break;
            case 2:
              tipoAtendimento = "Tosa";
              break;
            case 3:
              tipoAtendimento = "Banho e Tosa";
              break;
            case 4:
              tipoAtendimento = "Consulta";
              break;
            default:
              System.out.println("Tipo de atendimento inválido!");
              return;
          }

          ///////////////////////////////////////////////////////////////////
          /////////////////////// Tipo de Doença ////////////////////////////
          ///////////////////////////////////////////////////////////////////

          String doenca = null;

          if (tipoAtendimento.equals("Consulta")) {

            System.out.print("O animal está doente? (s/n): ");
            String resposta = scanner.nextLine().trim().toLowerCase();

            if (resposta.equals("s")) {

              System.out.println("\nDoenças comuns deste animal:");
              String[] lista = animal.getDoencasComuns();

              for (int i = 0; i < lista.length; i++) {
                System.out.println((i + 1) + " - " + lista[i]);
              }

              System.out.print("Escolha a doença: ");
              int escolha = Integer.parseInt(scanner.nextLine());

              if (escolha < 1 || escolha > lista.length) {
                System.out.println("Opção inválida!");
                return;
              }

              doenca = lista[escolha - 1];

            } else if (resposta.equals("n")) {
              doenca = null;
            } else {
              System.out.println("Resposta inválida!");
              return;
            }
          }

          ///////////////////////////////////////////////////////////////////
          /////////////////////// Cadastra Consulta /////////////////////////
          ///////////////////////////////////////////////////////////////////

          try {
            Consulta consulta = new Consulta(animal, tipoAtendimento, doenca);
            agenda.adicionarConsulta(consulta);
            System.out.println("Consulta cadastrada com sucesso!");
          } catch (ValidacaoException e) {
            System.out.println("Erro ao criar consulta: " + e.getMessage());
          }



          break;

          // Lista Consultas Cadastradas
        case 2:
          agenda.listarConsultas();
          break;

          // Encerra o programa
        case 3:
          System.out.println("Encerrando o programa...");
          break;

          //Opção inválida
        default:
          System.out.println("Opção Inválida!");
      }

    } while (opcao != 3);

    scanner.close();

  }
}
