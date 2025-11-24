package TrabalhoFinal;

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

          String menu = "MENU PRINCIPAL:\n" +
                  "1 - Registrar consulta\n" +
                  "2 - Ver todas as consultas\n" +
                  "3 - Remover consulta\n" +
                  "0 - Encerrar\n\n" +
                  "Escolha uma opção:";

          String resposta = JOptionPane.showInputDialog(menu);
          if (resposta == null) continue;

          switch (resposta) {
              case "1":
                  registrarConsulta(agenda);
                  break;

              case "2":
                  JOptionPane.showMessageDialog(null, agenda.listarConsultas());
                  break;

              case "3":
                  removerConsulta(agenda);
                  break;

              case "0":
                  return;

              default:
                  JOptionPane.showMessageDialog(null, "Opção inexistente.");
          }
      }
  }

    private static void removerConsulta(Agenda agenda) {
        try {
            String nome = JOptionPane.showInputDialog("Informe o nome do animal para excluir a consulta:");
            agenda.cancelarConsulta(nome);
            JOptionPane.showMessageDialog(null, "Consulta removida com sucesso.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    private static void registrarConsulta(Agenda agenda) {
        try {
            String tipoAnimal = JOptionPane.showInputDialog(
                    "Selecione o tipo de animal:\n" +
                            "1 - Cachorro\n" +
                            "2 - Gato\n" +
                            "3 - Coelho");

            Animal animal;

            switch (tipoAnimal) {
                case "1":
                    animal = new Cachorro(
                            JOptionPane.showInputDialog("Nome do animal: "),
                            Integer.parseInt(JOptionPane.showInputDialog("Idade: ")),
                            JOptionPane.showInputDialog("Raça: ")
                    );
                    break;

                case "2":
                    animal = new Gato(
                            JOptionPane.showInputDialog("Nome do animal: "),
                            Integer.parseInt(JOptionPane.showInputDialog("Idade: ")),
                            JOptionPane.showInputDialog("Raça: ")
                    );
                    break;

                case "3":
                    animal = new Coelho(
                            JOptionPane.showInputDialog("Nome do animal: "),
                            Integer.parseInt(JOptionPane.showInputDialog("Idade: ")),
                            JOptionPane.showInputDialog("Raça: ")
                    );
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Tipo de animal inválido.");
                    return;
            }

            String tipoAtendimento = JOptionPane.showInputDialog(
                    "Qual o atendimento desejado?\n" +
                            "1 - Banho\n" +
                            "2 - Tosa\n" +
                            "3 - Banho + Tosa\n" +
                            "4 - Tratamento");

            String atendimentoEscolhido;

            switch (tipoAtendimento) {
                case "1": atendimentoEscolhido = "Banho"; break;
                case "2": atendimentoEscolhido = "Tosa"; break;
                case "3": atendimentoEscolhido = "Banho e Tosa"; break;
                case "4": atendimentoEscolhido = "Tratamento"; break;
                default:
                    JOptionPane.showMessageDialog(null, "Tipo de atendimento não reconhecido.");
                    return;
            }

            Atendimento atendimento = new Atendimento(atendimentoEscolhido);

            // Pega a data
            String dataConsulta;
            while (true) {
                dataConsulta = JOptionPane.showInputDialog("Informe a data (DD/MM/AAAA):");

                if (dataConsulta == null || dataConsulta.trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "A data não pode ficar em branco.");
                    continue;
                }

                try {
                    LocalDate.parse(dataConsulta.trim(), FORMATTER);
                    break;
                } catch (DateTimeParseException e) {
                    JOptionPane.showMessageDialog(null, "Formato inválido. Use DD/MM/AAAA.");
                }
            }

            String doencaSelecionada = null;

            if (atendimentoEscolhido.equals("Tratamento")) {

                String[] opcoesDoencas = animal.getDoencas();
                StringBuilder texto = new StringBuilder("Escolha o problema do animal:\n");

                for (int i = 0; i < opcoesDoencas.length; i++) {
                    texto.append(i + 1).append(" - ").append(opcoesDoencas[i]).append("\n");
                }

                String escolha = JOptionPane.showInputDialog(texto.toString());
                int pos = Integer.parseInt(escolha) - 1;

                if (pos < 0 || pos >= opcoesDoencas.length) {
                    JOptionPane.showMessageDialog(null, "Opção inválida.");
                    return;
                }

                doencaSelecionada = opcoesDoencas[pos];
            }

            Consulta consulta = new Consulta(animal, atendimento, dataConsulta, doencaSelecionada);
            agenda.adicionarConsulta(consulta);

            JOptionPane.showMessageDialog(null, "Consulta registrada com sucesso!");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}