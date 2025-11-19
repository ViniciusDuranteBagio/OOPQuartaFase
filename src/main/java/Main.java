import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        Agenda agenda = new Agenda();
        executarMenuPrincipal(agenda);

        JOptionPane.showMessageDialog(null, "Sistema encerrado!");
    }

    private static void executarMenuPrincipal(Agenda agenda) {

        while (true) {

            int op = mostrarMenu();

            switch (op) {
                case 1:
                    listarConsultas(agenda);
                    break;

                case 2:
                    cadastrarConsulta(agenda);
                    break;

                case 3:
                    return;

                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!");
            }
        }
    }

    private static int mostrarMenu() {
        String menu = """
                === AGENDA DO VETERINÁRIO(A) ===
                1 - Listar consultas
                2 - Cadastrar consulta
                3 - Sair
                """;

        return lerInt(menu);
    }

    private static void listarConsultas(Agenda agenda) {
        if (agenda.vazia()) {
            JOptionPane.showMessageDialog(null, "Nenhuma cadastrada ainda.");
        } else {
            agenda.listar();
        }
    }

    // -------------------------------
    //   CADASTRAR CONSULTA
    // -------------------------------
    private static void cadastrarConsulta(Agenda agenda) {

        try {
            Animal animal = criarAnimal();
            String tipoConsulta = escolherTipoAtendimento();
            String doenca = escolherDoencaSeNecessario(animal, tipoConsulta);

            agenda.adicionar(new Consulta(animal, tipoConsulta, doenca));
            JOptionPane.showMessageDialog(null, "Consulta cadastrada com sucesso!");

        } catch (ValidacaoException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro inesperado: " + e.getMessage());
        }
    }

    // -------------------------------
    //   CRIAÇÃO DO ANIMAL
    // -------------------------------
    private static Animal criarAnimal() throws ValidacaoException {

        int tipo = lerInt("""
                Tipo do animal:
                1 - Cachorro
                2 - Gato
                3 - Coelho
                """);

        String nome = JOptionPane.showInputDialog("Nome do animal:");
        if (nome == null || nome.isBlank()) throw new ValidacaoException("O nome não pode ser vazio.");
        validarNome(nome);

        int idade = lerInt("Idade:");
        validarIdade(idade);

        String raca = JOptionPane.showInputDialog("Raça:");
        if (raca == null || raca.isBlank())
            throw new ValidacaoException("A raça não pode ser vazia.");

        return switch (tipo) {
            case 1 -> new Cachorro(nome, idade, raca);
            case 2 -> new Gato(nome, idade, raca);
            case 3 -> new Coelho(nome, idade, raca);
            default -> throw new ValidacaoException("Tipo inválido.");
        };
    }

    // -------------------------------
    //   TIPO DE ATENDIMENTO
    // -------------------------------
    private static String escolherTipoAtendimento() throws ValidacaoException {

        int atendimento = lerInt("""
                Tipo de atendimento:
                1 - Banho
                2 - Tosa
                3 - Banho e Tosa
                4 - Consulta
                """);

        return switch (atendimento) {
            case 1 -> "Banho";
            case 2 -> "Tosa";
            case 3 -> "Banho e Tosa";
            case 4 -> "Consulta";
            default -> throw new ValidacaoException("Atendimento inválido.");
        };
    }

    // -------------------------------
    //   DOENÇA (APENAS SE CONSULTa)
    // -------------------------------
    private static String escolherDoencaSeNecessario(Animal animal, String tipoConsulta)
            throws ValidacaoException {

        if (!tipoConsulta.equals("Consulta"))
            return null;

        String verificacao = JOptionPane.showInputDialog("O animal está doente? (s/n)");

        if (!verificacao.equalsIgnoreCase("s"))
            return null;

        String[] doencas = animal.getDoencas();

        StringBuilder menu = new StringBuilder("Escolha a doença:\n");
        for (int i = 0; i < doencas.length; i++) {
            menu.append(i + 1).append(" - ").append(doencas[i]).append("\n");
        }

        int escolha = lerInt(menu.toString());

        if (escolha < 1 || escolha > doencas.length)
            throw new ValidacaoException("Doença inválida.");

        return doencas[escolha - 1];
    }

    // -------------------------------
    //   VALIDAÇÕES
    // -------------------------------
    private static void validarNome(String nome) throws ValidacaoException {
        if (!nome.matches("[A-Za-zÀ-ÖØ-öø-ÿ ]{2,}"))
            throw new ValidacaoException("Nome inválido! Use apenas letras e pelo menos 2 caracteres.");
    }

    private static void validarIdade(int idade) throws ValidacaoException {
        if (idade <= 0)
            throw new ValidacaoException("Idade deve ser maior que 0.");
    }

    // -------------------------------
    //  OBRIGA O USUARIO A DIGITAR NUMEROS
    // -------------------------------
    private static int lerInt(String mensagem) {
        while (true) {
            try {
                String entrada = JOptionPane.showInputDialog(mensagem);

                if (entrada == null || entrada.isBlank()) {
                    JOptionPane.showMessageDialog(null, "Digite um número!");
                    continue;
                }

                return Integer.parseInt(entrada);

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Digite um número válido!");
            }
        }
    }
}
