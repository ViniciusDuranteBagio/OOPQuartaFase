package trabalho_final;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class AgendaVeterinario {
    private static final List<Consulta> consultas = new ArrayList<>();
    private static final int MAX_CONSULTAS = 10;

    public static void main(String[] args) {
        while (true) {
            String opcao = JOptionPane.showInputDialog(
                "=== AGENDA VETERINÁRIA ===\n" +
                "1 - Cadastrar consulta\n" +
                "2 - Listar consultas\n" +
                "3 - Sair\n" +
                "Escolha uma opção:");

            if (opcao == null || opcao.equals("3")) {
                JOptionPane.showMessageDialog(null, "Programa encerrado.");
                break;
            }

            switch (opcao) {
                case "1" -> cadastrarConsulta();
                case "2" -> listarConsultas();
                default -> JOptionPane.showMessageDialog(null, "Opção inválida!");
            }
        }
    }

    private static void cadastrarConsulta() {
        if (consultas.size() >= MAX_CONSULTAS) {
            JOptionPane.showMessageDialog(null, "Agenda cheia! Não há mais horários disponíveis.");
            return;
        }

        try {
            
            String tipoStr = JOptionPane.showInputDialog(
                "Tipo de animal:\n1 - Cachorro\n2 - Gato\n3 - Coelho");
            if (tipoStr == null) return;

            Animal animal = switch (tipoStr) {
                case "1" -> criarCachorro();
                case "2" -> criarGato();
                case "3" -> criarCoelho();
                default -> {
                    JOptionPane.showMessageDialog(null, "Tipo de animal inválido!");
                    yield null;
                }
            };
            if (animal == null) return;

            
            String atendimentoStr = JOptionPane.showInputDialog(
                "Tipo de atendimento:\n1 - Banho\n2 - Tosa\n3 - Banho e Tosa\n4 - Consulta");
            if (atendimentoStr == null) return;

            int tipoAtendimento;
            try {
                tipoAtendimento = Integer.parseInt(atendimentoStr);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Digite apenas o número!");
                return;
            }

            if (tipoAtendimento < 1 || tipoAtendimento > 4) {
                JOptionPane.showMessageDialog(null, "Tipo de atendimento inválido!");
                return;
            }

            
            String doenca = null;
            if (tipoAtendimento == TipoAtendimento.CONSULTA) {
                String doente = JOptionPane.showInputDialog("O animal está doente? (s/n)");
                if (doente == null) return;

                if (doente.trim().equalsIgnoreCase("s")) {
                    List<String> doencas = animal.getDoencasComuns();
                    String lista = String.join("\n", doencas);
                    doenca = JOptionPane.showInputDialog(
                        "Doenças comuns para " + animal.getTipoAnimal() + ":\n" + lista +
                        "\n\nDigite a doença do animal:");
                    if (doenca == null || doenca.trim().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Doença não informada!");
                        return;
                    }
                }
            }

            Consulta consulta = new Consulta(animal, tipoAtendimento, doenca);
            consultas.add(consulta);
            JOptionPane.showMessageDialog(null, "Consulta cadastrada com sucesso!");

        } catch (ValidacaoException e) {
            JOptionPane.showMessageDialog(null, "Erro de validação:\n" + e.getMessage(),
                "Erro", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro inesperado: " + e.getMessage());
        }
    }

    private static Animal criarCachorro() throws ValidacaoException {
        String nome = JOptionPane.showInputDialog("Nome do cachorro:");
        if (nome == null) throw new ValidacaoException("Operação cancelada.");
        String idadeStr = JOptionPane.showInputDialog("Idade do cachorro:");
        if (idadeStr == null) throw new ValidacaoException("Operação cancelada.");
        String raca = JOptionPane.showInputDialog("Raça do cachorro:");
        if (raca == null) throw new ValidacaoException("Operação cancelada.");

        int idade = Integer.parseInt(idadeStr.trim());
        return new Cachorro(nome.trim(), idade, raca.trim());
    }

    private static Animal criarGato() throws ValidacaoException {
        String nome = JOptionPane.showInputDialog("Nome do gato:");
        if (nome == null) throw new ValidacaoException("Operação cancelada.");
        String idadeStr = JOptionPane.showInputDialog("Idade do gato:");
        if (idadeStr == null) throw new ValidacaoException("Operação cancelada.");
        String raca = JOptionPane.showInputDialog("Raça do gato:");
        if (raca == null) throw new ValidacaoException("Operação cancelada.");

        int idade = Integer.parseInt(idadeStr.trim());
        return new Gato(nome.trim(), idade, raca.trim());
    }

    private static Animal criarCoelho() throws ValidacaoException {
        String nome = JOptionPane.showInputDialog("Nome do coelho:");
        if (nome == null) throw new ValidacaoException("Operação cancelada.");
        String idadeStr = JOptionPane.showInputDialog("Idade do coelho:");
        if (idadeStr == null) throw new ValidacaoException("Operação cancelada.");
        String raca = JOptionPane.showInputDialog("Raça do coelho:");
        if (raca == null) throw new ValidacaoException("Operação cancelada.");

        int idade = Integer.parseInt(idadeStr.trim());
        return new Coelho(nome.trim(), idade, raca.trim());
    }

    private static void listarConsultas() {
        if (consultas.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nenhuma consulta cadastrada ainda.");
            return;
        }

        StringBuilder sb = new StringBuilder("=== CONSULTAS CADASTRADAS ===\n\n");
        for (int i = 0; i < consultas.size(); i++) {
            sb.append((i + 1)).append(" - ").append(consultas.get(i).toString()).append("\n");
        }
        sb.append("\nTotal: ").append(consultas.size()).append("/10");
        JOptionPane.showMessageDialog(null, sb.toString());
    }
}