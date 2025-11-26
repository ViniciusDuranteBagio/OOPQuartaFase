import javax.swing.*;
import java.util.ArrayList;

public class agendaVeterinaria {
    ArrayList<String> agenda = new ArrayList<>();

    public void mostrarAgenda() {
        if (agenda.isEmpty()) {
            JOptionPane.showMessageDialog(null, "A agenda está vazia!");
            return;
        }

        String nomes = "";
        for (String nome : agenda) {
            nomes += nome;
        }
    }
}
