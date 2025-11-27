import javax.swing.JOptionPane;

public class Main {
    private static AgendaVeterinario agenda = new AgendaVeterinario();

    public static void main(String[] args) {
        while (true) {
            try {
                String[] opcoes = {"Cadastrar Consulta", "Listar Consultas", "Sair"};
                int escolha = JOptionPane.showOptionDialog(
                        null,
                        "O que deseja fazer?",
                        "Sistema de Agenda Veterinária",
                        JOptionPane.DEFAULT_OPTION,
                        JOptionPane.QUESTION_MESSAGE,
                        null,
                        opcoes,
                        opcoes[0]
                );

                if (escolha == 0) {
                    cadastrarConsulta();
                } else if (escolha == 1) {
                    listarConsultas();
                } else {
                    int confirma = JOptionPane.showConfirmDialog(
                            null,
                            "Deseja realmente sair?",
                            "Confirmar",
                            JOptionPane.YES_NO_OPTION
                    );
                    if (confirma == JOptionPane.YES_OPTION) {
                        JOptionPane.showMessageDialog(null, "Sistema encerrado!");
                        break;
                    }
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(
                        null,
                        "Erro: " + e.getMessage(),
                        "Erro",
                        JOptionPane.ERROR_MESSAGE
                );
            }
        }
    }

    private static void listarConsultas() {
        String lista = agenda.listarConsultas();
        JOptionPane.showMessageDialog(
                null,
                lista,
                "Consultas do Dia",
                JOptionPane.INFORMATION_MESSAGE
        );
    }
}