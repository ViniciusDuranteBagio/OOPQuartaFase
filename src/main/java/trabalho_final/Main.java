package trabalho_final;

import javax.swing.JOptionPane;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Main {

    private static final DateTimeFormatter FORMATTER =
            DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public static void main(String[] args) {
        Agenda agenda = new Agenda();

        while (true) {

            String menu = "MENU:\n" +
                    "1 - Cadastrar consulta\n" +
                    "2 - Listar consultas\n" +
                    "3 - Cancelar consulta\n" +
                    "0 - Sair\n\n" +
                    "Escolha uma opção:";

            String opcoesMenu = JOptionPane.showInputDialog(menu);
            if (opcoesMenu == null) continue;

            switch (opcoesMenu) {
                case "1":
                    cadastrarConsulta(agenda);
                    break;

                case "2":
                    JOptionPane.showMessageDialog(null, agenda.listarConsultas());
                    break;

                case "3":
                    cancelarConsulta(agenda);
                    break;

                case "0":
                    return;

                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida.");
            }
        }
    }

    private static void cancelarConsulta(Agenda agenda) {
        try {
            String nome = JOptionPane.showInputDialog("Diga o nome do animal para cancelar a consulta");
            agenda.cancelarConsulta(nome);
            JOptionPane.showMessageDialog(null, "Consulta cancelada");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    private static void cadastrarConsulta(Agenda agenda) {
        try {
            String a = JOptionPane.showInputDialog(
                    "Tipo de animal:\n1 - Cachorro" +
                            "\n2 - Gato" +
                            "\n3 - Coelho");

            Animal animal;

            switch (a) {
                case "1":
                    animal = new Cachorro(
                            JOptionPane.showInputDialog("Nome:"),
                            JOptionPane.showInputDialog("Idade (identifique se o número representa anos ou meses):"),
                            JOptionPane.showInputDialog("Raça:")
                    );
                    break;

                case "2":
                    animal = new Gato(
                            JOptionPane.showInputDialog("Nome:"),
                            JOptionPane.showInputDialog("Idade (identifique se o número representa anos ou meses):"),
                            JOptionPane.showInputDialog("Raça:")
                    );
                    break;

                case "3":
                    animal = new Coelho(
                            JOptionPane.showInputDialog("Nome:"),
                            JOptionPane.showInputDialog("Idade (identifique se o número representa anos ou meses):"),
                            JOptionPane.showInputDialog("Raça:")
                    );
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Animal inválido.");
                    return;
            }
            String t = JOptionPane.showInputDialog(
                    "Tipo de atendimento:\n" +
                            "1 - Banho\n" +
                            "2 - Tosa\n" +
                            "3 - Banho e Tosa\n" +
                            "4 - Tratamento");

            String tipo;

            switch (t) {
                case "1": tipo = "Banho"; break;
                case "2": tipo = "Tosa"; break;
                case "3": tipo = "Banho e Tosa"; break;
                case "4": tipo = "Tratamento"; break;
                default:
                    JOptionPane.showMessageDialog(null, "Atendimento inválido.");
                    return;
            }

            Atendimento atendimento = new Atendimento(tipo);
            String data;
            while (true) {
                data = JOptionPane.showInputDialog("Data da consulta (DD/MM/YYYY):");

                if (data == null || data.trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Data vazia.");
                    continue;
                }

                try {
                    LocalDate.parse(data.trim(), FORMATTER);
                    break;
                } catch (DateTimeParseException e) {
                    JOptionPane.showMessageDialog(null,
                            "Data inválida. Use o formato DD/MM/YYYY.");
                }
            }

            String doenca = null;

            if (tipo.equals("Tratamento")) {
                String[] lista = animal.getDoencas();
                StringBuilder menuDoencas = new StringBuilder("Escolha a doença:\n");

                for (int i = 0; i < lista.length; i++) {
                    menuDoencas.append((i + 1)).append(" - ").append(lista[i]).append("\n");
                }

                String escolha = JOptionPane.showInputDialog(menuDoencas.toString());
                int index = Integer.parseInt(escolha) - 1;

                if (index < 0 || index >= lista.length) {
                    JOptionPane.showMessageDialog(null, "Doença inválida.");
                    return;
                }

                doenca = lista[index];
            }

            Consulta consulta = new Consulta(animal, atendimento, data, doenca);
            agenda.adicionarConsulta(consulta);

            JOptionPane.showMessageDialog(null, "Consulta cadastrada.");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}
