import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        iniciar(agenda);
        JOptionPane.showMessageDialog(null, "Encerrando o sistema.");
    }

    private static void iniciar(Agenda agenda) {
        while (true) {
            int escolha = mostrarMenu();

            if (escolha == 1) {
                exibirAgendamentos(agenda);
            } else if (escolha == 2) {
                registrar(agenda);
            } else if (escolha == 3) {
                return;
            } else {
                JOptionPane.showMessageDialog(null, "Opção inválida.");
            }
        }
    }
    private static int mostrarMenu() {
        String texto = """
                === CONSULTÓRIO VETERINÁRIO ===
                1 - Ver consultas
                2 - Nova consulta
                3 - Sair
                """;
        return lerNumero(texto);
    }

    private static void exibirAgendamentos(Agenda agenda) {
        if (agenda.estaVazia()) {
            JOptionPane.showMessageDialog(null, "Ainda não há consultas registradas.");
        } else {
            agenda.exibirConsultas();
        }
    }

    private static void registrar(Agenda agenda) {

        try {
            Animal pet = criarAnimal();
            String tipo = tipoAtendimento();
            String enfermidade = selecionarEnfermidade(pet, tipo);

            Consulta nova = new Consulta(pet, tipo, enfermidade);
            agenda.inserir(nova);

            JOptionPane.showMessageDialog(null, "Consulta registrada!");

        } catch (ValidacaoException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
        }
    }

    private static Animal criarAnimal() throws ValidacaoException {
        int opcao = lerNumero("""
                Selecione o animal:
                1 - Cachorro
                2 - Gato
                3 - Coelho
                """);

        String nome = JOptionPane.showInputDialog("Informe o nome:");
        if (nome == null || nome.isBlank()) throw new ValidacaoException("Nome obrigatório.");
        validarNome(nome);

        int idade = lerNumero("Idade:");
        validarIdade(idade);

        String raca = JOptionPane.showInputDialog("Raça:");
        if (raca == null || raca.isBlank()) throw new ValidacaoException("Raça obrigatória.");

        return switch (opcao) {
            case 1 -> new Cachorro(nome, idade, raca);
            case 2 -> new Gato(nome, idade, raca);
            case 3 -> new Coelho(nome, idade, raca);
            default -> throw new ValidacaoException("Animal inexistente.");
        };
    }

    private static String tipoAtendimento() throws ValidacaoException {
        int tipo = lerNumero("""
                Atendimento:
                1 - Banho
                2 - Tosa
                3 - Banho e Tosa
                4 - Consulta
                """);

        return switch (tipo) {
            case 1 -> "Banho";
            case 2 -> "Tosa";
            case 3 -> "Banho e Tosa";
            case 4 -> "Consulta";
            default -> throw new ValidacaoException("Tipo inválido.");
        };
    }

    private static String selecionarEnfermidade(Animal a, String tipo) throws ValidacaoException {
        if (!tipo.equals("Consulta")) return null;

        String resposta = JOptionPane.showInputDialog("O animal apresenta sintomas? (s/n)");
        if (resposta == null || !resposta.equalsIgnoreCase("s")) return null;

        String[] lista = a.doencas();
        StringBuilder menu = new StringBuilder("Escolha a doença:\n");

        for (int i = 0; i < lista.length; i++) {
            menu.append(i + 1).append(" - ").append(lista[i]).append("\n");
        }

        int cod = lerNumero(menu.toString());
        if (cod < 1 || cod > lista.length) throw new ValidacaoException("Opção inválida.");

        return lista[cod - 1];
    }

    private static void validarNome(String nome) throws ValidacaoException {
        if (!nome.matches("[A-Za-zÀ-ÖØ-öø-ÿ ]{2,}"))
            throw new ValidacaoException("Nome inválido. Deve conter apenas letras e ao menos 2 caracteres.");
    }

    private static void validarIdade(int idade) throws ValidacaoException {
        if (idade <= 0) throw new ValidacaoException("Idade deve ser maior que zero.");
    }

    private static int lerNumero(String msg) {
        while (true) {
            try {
                String valor = JOptionPane.showInputDialog(msg);
                if (valor == null || valor.isBlank()) {
                    JOptionPane.showMessageDialog(null, "Informe um número.");
                    continue;
                }
                return Integer.parseInt(valor);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Número inválido.");
            }
        }
    }
}
