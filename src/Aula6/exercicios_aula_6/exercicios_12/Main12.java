package exercicios_aula_6.exercicios_12;

import javax.swing.*;

public class Main12 {
    public static void main(String[] args) {
        ValidadorEntrada validador = new ValidadorEntrada();
        double numero = 0;
        boolean valido = false;

        while (!valido) {
            try {
                String entrada = JOptionPane.showInputDialog("Digite um número positivo:");

                if (entrada == null) {
                    JOptionPane.showMessageDialog(null, "Operação cancelada pelo usuário");
                    return;
                }

                numero = Double.parseDouble(entrada);

                if (!validador.validar(numero)) {
                    JOptionPane.showMessageDialog(null, "Digite apenas valores positivos");
                    continue;
                }

                valido = true;

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Digite apenas números");
            }
        }

        JOptionPane.showMessageDialog(null, "Número digitado: " + numero);
    }
}
