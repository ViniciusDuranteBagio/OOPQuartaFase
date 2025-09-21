package Atividades.Aula5;
import javax.swing.*;

public class PDF implements  exportarcao{
    @Override
    public void exportar(String dados) {
        JOptionPane.showMessageDialog(null, "Dados exportados para PDF:\n" + dados);

    }
}

