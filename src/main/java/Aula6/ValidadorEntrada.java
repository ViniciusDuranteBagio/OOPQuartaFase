package Aula6;

import javax.swing.*;

public class ValidadorEntrada {
    public int lerNumeroPositivo() {
        int numero = -1;
        while (numero < 0) {
            try {
                numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número positivo:"));
                if (numero < 0) throw new IllegalArgumentException("Número negativo não é permitido.");
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Digite um número válido.");
            } catch (IllegalArgumentException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
        return numero;
    }
}