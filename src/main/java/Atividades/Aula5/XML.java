package Atividades.Aula5;
import javax.swing.*;

public class XML implements  exportarcao{
    @Override
    public void exportar(String dados) {
        JOptionPane.showMessageDialog(null, "Dados exportados para XML:\n" + dados);
    }
}
