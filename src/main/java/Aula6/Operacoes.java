package Aula6;

import javax.swing.*;

public class Operacoes {

    public void converterEDividir() {
        boolean valido = false;
        while (!valido) {
            try {
                String texto = JOptionPane.showInputDialog("Digite um número:");
                double numero = Double.parseDouble(texto);

                double divisor = Double.parseDouble(JOptionPane.showInputDialog("Digite o divisor:"));
                if (divisor == 0) {
                    throw new ArithmeticException("Divisão por zero não é permitida.");
                }

                double resultado = numero / divisor;
                JOptionPane.showMessageDialog(null, "Resultado: " + resultado);
                valido = true;

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Digite um número válido.");
            } catch (ArithmeticException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
    }
}