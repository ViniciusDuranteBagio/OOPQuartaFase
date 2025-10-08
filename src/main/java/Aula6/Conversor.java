package Aula6;

import javax.swing.*;

public class Conversor {

    public void converter() {
        boolean convertido = false;

        while (!convertido) {
            try {
                String entrada = JOptionPane.showInputDialog("Digite um número:");

                double valorDouble = Double.parseDouble(entrada);

                int numConvertido = (int) valorDouble;

                JOptionPane.showMessageDialog(null, "Número convertido para inteiro: " + numConvertido);

                convertido = true;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada inválida. Digite um número válido.");
            }
        }
    }
}