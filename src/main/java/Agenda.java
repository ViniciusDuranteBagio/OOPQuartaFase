import javax.swing.*;
import java.util.ArrayList;

public class Agenda {
    ArrayList<String> agenda = new ArrayList<>();

    public void mostrarAgenda() {
        if (agenda.isEmpty()) {
            JOptionPane.showMessageDialog(null, "agenda vazia");
            return;
        }

        String nomes = "";
        for (String nome : agenda) {
            nomes += nome;
        }
    }
}