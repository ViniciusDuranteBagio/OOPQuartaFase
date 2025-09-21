package Atividades.Aula5;
import javax.swing.*;

public class CSV implements exportarcao{
    @Override
    public void exportar(String dados) {
        JOptionPane.showMessageDialog(null, "Dados exportados para CSV:\n" + dados);
    }
}
