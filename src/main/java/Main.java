import javax.swing.*;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {

        ArrayList<Consulta> agenda = new ArrayList<>();

        int menu = -1;

        String menu1 =
                "--- Menu ---\n" +
                        "1- Cadastrar consulta\n" +
                        "2- Listar consultas\n" +
                        "0- Sair";

        String menu2 =
                "Selecione o animal\n" +
                        "1- Cachorro\n" +
                        "2- Gato\n" +
                        "3- Coelho\n" +
                        "0- Voltar";

        String menu3 =
                "Tipo de Serviço:\n" +
                        "1- Banho\n" +
                        "2- Banho e Tosa\n" +
                        "3- Tosa\n" +
                        "4- Consulta";

        while (menu != 0) {

            menu = Integer.parseInt(JOptionPane.showInputDialog(menu1));

            if (menu == 1) {

                if (agenda.size() >= 10) {
                    JOptionPane.showMessageDialog(null, "Agenda cheia! Máximo 10 consultas.");
                    continue;
                }

                int animalOpc = Integer.parseInt(JOptionPane.showInputDialog(menu2));
                if (animalOpc == 0) continue;

                Animal animal = null;

                try {
                    if (animalOpc == 1) animal = new Cachorro();
                    if (animalOpc == 2) animal = new Gato();
                    if (animalOpc == 3) animal = new Coelho();

                    animal.setNome(JOptionPane.showInputDialog("Nome do animal:"));
                    animal.setIdade(Double.parseDouble(JOptionPane.showInputDialog("Idade:")));
                    animal.setRaca(JOptionPane.showInputDialog("Raça:"));

                } catch (ValidacaoException e) {
                    JOptionPane.showMessageDialog(null, e.getMessage());
                    continue;
                }

                int tipoServico = Integer.parseInt(JOptionPane.showInputDialog(menu3));

                String servico = "";
                if (tipoServico == 1) servico = "Banho";
                if (tipoServico == 2) servico = "Banho e Tosa";
                if (tipoServico == 3) servico = "Tosa";
                if (tipoServico == 4) servico = "Consulta";

                String doenca = "";

                if (servico.equals("Consulta")) {
                    int doente = JOptionPane.showConfirmDialog(null,
                            "O animal está doente?", "Doença", JOptionPane.YES_NO_OPTION);

                    if (doente == 0) {
                        String[] lista = animal.getDoencas();
                        String msg = "Selecione a doença:\n";
                        for (int i=0; i<lista.length; i++) {
                            msg += (i+1) + " - " + lista[i] + "\n";
                        }
                        int d = Integer.parseInt(JOptionPane.showInputDialog(msg));
                        doenca = lista[d-1];
                    }
                }

                agenda.add(new Consulta(animal, servico, doenca));

                JOptionPane.showMessageDialog(null, "Agendamento cadastrado!");

            } else if (menu == 2) {

                if (agenda.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Nenhuma consulta cadastrada.");
                    continue;
                }

                StringBuilder sb = new StringBuilder("Consultas:\n\n");

                for (Consulta c : agenda) {
                    sb.append(c.toString()).append("\n");
                }

                JOptionPane.showMessageDialog(null, sb.toString());

            }
        }
    }
}