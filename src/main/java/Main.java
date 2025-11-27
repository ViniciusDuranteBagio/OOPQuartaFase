import java.util.List;
import java.util.Scanner;

public class Main {
  private static final Scanner scanner = new Scanner(System.in);
  private static final Agenda agenda = new Agenda(10);

  public static void main(String[] args) {
    System.out.println("=== Sistema de Agenda do Veterinário ===");
    boolean sair = false;
    while (!sair) {
      System.out.println("\n        Escolha uma opção:");
      System.out.println("    1 - Listar consultas");
      System.out.println("    2 - Cadastrar consulta");
      System.out.println("    0 - Sair");
      System.out.print("> ");
      String op = scanner.nextLine().trim();
      switch (op) {
        case "1": listarConsultas(); break;
        case "2": cadastrarConsulta(); break;
        case "0": sair = true; break;
        default: System.out.println("Opção inválida. Tente novamente."); break;
      }
    }
    System.out.println("Encerrando sistema. Até mais!");
  }

  private static void listarConsultas() {
    List<Consulta> lista = agenda.listarConsultas();
    if (lista.isEmpty()) {
      System.out.println("        Nenhuma cadastrada ainda");
    } else {
      System.out.println("        Consultas cadastradas:");
      for (int i = 0; i < lista.size(); i++) {
        System.out.printf("%d) %s%n", i + 1, lista.get(i).toString());
      }
    }
    System.out.println("\n        Pressione Enter para voltar...");
    scanner.nextLine();
  }

  private static void cadastrarConsulta() {
    try {
      Animal animal = criarAnimal();
      Consulta.TipoAtendimento tipo = escolherTipoAtendimento();
      Consulta consulta = new Consulta(animal, tipo);

      if (tipo == Consulta.TipoAtendimento.CONSULTA) {
        System.out.print("O animal está doente? s/n: ");
        String resp = scanner.nextLine().trim().toLowerCase();
        if (resp.equals("s") || resp.equals("sim")) {
          String doenca = escolherDoencaParaAnimal(animal);
          consulta.setDoenca(doenca);
        }
      }

      agenda.adicionarConsulta(consulta);
      System.out.println("        Consulta cadastrada com sucesso");
    } catch (ValidacaoException ve) {
      System.out.println("        Erro de validação:" + ve.getMessage());
    } catch (Exception e) {
      System.out.println("        Erro: " + e.getMessage());
    }
  }

  private static Animal criarAnimal() throws ValidacaoException {
    System.out.println("        Escolha o tipo de animal:");
    System.out.println("1          Cachorro");
    System.out.println("2          Gato");
    System.out.println("3          Coelho");
    System.out.print("> ");
    String tipo = scanner.nextLine().trim();

    System.out.print("Nome: ");
    String nome = scanner.nextLine();

    System.out.print("Idade: ");
    String idadeStr = scanner.nextLine();
    int idade;
    try {
      idade = Integer.parseInt(idadeStr);
    } catch (NumberFormatException nfe) {
      throw new ValidacaoException("Idade inválida deve ser um número inteiro positivo.");
    }

    System.out.print("Raça: ");
    String raca = scanner.nextLine().trim();

    if (!raca.matches("[a-zA-ZÀ-ÿ ]{2,}")) {
      throw new ValidacaoException("Raça deve conter apenas letras e no mínimo 2 caracteres.");
    }

    return switch (tipo) {
      case "1" -> new Cachorro(nome, idade, raca);
      case "2" -> new Gato(nome, idade, raca);
      case "3" -> new Coelho(nome, idade, raca);
      default -> throw new ValidacaoException("Tipo de animal inválido.");
    };
  }

  private static Consulta.TipoAtendimento escolherTipoAtendimento() throws ValidacaoException {
    System.out.println("Escolha o tipo de atendimento:");
    System.out.println("1 - Banho");
    System.out.println("2 - Tosa");
    System.out.println("3 - Banho e Tosa");
    System.out.println("4 - Consulta");
    System.out.print("> ");
    String op = scanner.nextLine().trim();
    return switch (op) {
      case "1" -> Consulta.TipoAtendimento.BANHO;
      case "2" -> Consulta.TipoAtendimento.TOSA;
      case "3" -> Consulta.TipoAtendimento.BANHO_E_TOSA;
      case "4" -> Consulta.TipoAtendimento.CONSULTA;
      default -> throw new ValidacaoException("Tipo de atendimento inválido.");
    };
  }

  private static String escolherDoencaParaAnimal(Animal animal) throws ValidacaoException {
    List<String> possiveis = animal.getDoencasPossiveis();
    System.out.println("Escolha a doença entre as listadas:");
    for (int i = 0; i < possiveis.size(); i++) {
      System.out.printf("%d - %s%n", i + 1, possiveis.get(i));
    }
    System.out.print("> ");
    String escolha = scanner.nextLine().trim();
    try {
      int idx = Integer.parseInt(escolha) - 1;
      if (idx < 0 || idx >= possiveis.size()) throw new ValidacaoException("Escolha de doença inválida.");
      return possiveis.get(idx);
    } catch (NumberFormatException nfe) {

      for (String d : possiveis) {
        if (d.equalsIgnoreCase(escolha)) return d;
      }
      throw new ValidacaoException("Doença inválida.");
    }
  }
}
