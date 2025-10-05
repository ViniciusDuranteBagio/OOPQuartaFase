package Aula6;

import javax.swing.JOptionPane;

public class ValidadorEntrada {

    public int lerNumeroPositivo() {
        while (true) {
            String input = JOptionPane.showInputDialog("Digite um número positivo:");
            if (input == null) {
                JOptionPane.showMessageDialog(null, "Entrada cancelada.");
                return -1;
            }
            try {
                int num = Integer.parseInt(input);
                if (num < 0) {
                    JOptionPane.showMessageDialog(null, "Número negativo não é permitido. Tente novamente.");
                } else {
                    return num;
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada inválida. Digite um número válido.");
            }
        }
    }

    public static void main(String[] args) {
        ValidadorEntrada validador = new ValidadorEntrada();
        int numero = validador.lerNumeroPositivo();
        if (numero >= 0) {
            System.out.println("Número válido: " + numero);
        }
    }
}
