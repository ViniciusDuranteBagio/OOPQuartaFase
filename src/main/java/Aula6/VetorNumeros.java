package Aula6;

import javax.swing.*;

public class VetorNumeros {
    private int[] numeros = new int[5];

    public VetorNumeros() {
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i * 10; // Exemplo de preenchimento
        }
    }

    public void acessarIndice() {
        boolean valido = false;
        while (!valido) {
            try {
                int indice = Integer.parseInt(JOptionPane.showInputDialog("Digite um índice de 0 a 4:"));
                JOptionPane.showMessageDialog(null, "Valor no índice " + indice + ": " + numeros[indice]);
                valido = true;
            } catch (ArrayIndexOutOfBoundsException e) {
                JOptionPane.showMessageDialog(null, "Índice inválido. Use entre 0 e 4.");
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Digite um número inteiro válido.");
            }
        }
    }
}