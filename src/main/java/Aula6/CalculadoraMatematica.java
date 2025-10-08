package Aula6;

import javax.swing.*;

public class CalculadoraMatematica {

    public void calcularRaiz() {
        boolean valido = false;
        while (!valido) {
            try {
                double numero = Double.parseDouble(JOptionPane.showInputDialog("Digite um número para calcular a raiz:"));
                if (numero < 0) {
                    throw new IllegalArgumentException("Não é possível calcular raiz de número negativo.");
                }
                double resultado = Math.sqrt(numero);
                JOptionPane.showMessageDialog(null, "Raiz quadrada: " + resultado);
                valido = true;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Digite um número válido.");
            } catch (IllegalArgumentException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
    }
}