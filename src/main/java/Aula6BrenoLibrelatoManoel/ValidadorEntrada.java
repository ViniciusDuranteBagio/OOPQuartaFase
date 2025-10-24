package Aula6BrenoLibrelatoManoel;

import javax.swing.JOptionPane;

public class ValidadorEntrada {
    public static void main(String[] args) {
        while (true) {
            try {
                String entrada = JOptionPane.showInputDialog("Digite um número positivo:");
                int numero = Integer.parseInt(entrada);

                if (numero < 0) {
                    JOptionPane.showMessageDialog(null, "Digite apenas números positivos!");
                    continue;
                }

                JOptionPane.showMessageDialog(null, "Número válido: " + numero);
                break;

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Digite um número válido!");
            }
        }
    }
}