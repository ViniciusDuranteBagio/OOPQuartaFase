package Aula6BrenoLibrelatoManoel;

import javax.swing.JOptionPane;

public class Conversor {
    public int converter(String texto) {
        return Integer.parseInt(texto);
    }

    public static void main(String[] args) {
        Conversor conv = new Conversor();

        while (true) {
            try {
                String entrada = JOptionPane.showInputDialog("Digite um número:");
                int numero = conv.converter(entrada);
                JOptionPane.showMessageDialog(null, "Número: " + numero);
                break;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Digite apenas números inteiros");
            }
        }
    }
}