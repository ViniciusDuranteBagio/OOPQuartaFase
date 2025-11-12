package exercicios_aula_5.exercicio_5;

import javax.swing.*;

public class Main5 {
    public static void main(String[] args) {
        VetorNumeros vetor = new VetorNumeros();

        try {
            String entrada = JOptionPane.showInputDialog(
                    "Digite um índice (0 a " + (vetor.getTamanho() - 1) + "):"
            );

            if (entrada == null) {
                JOptionPane.showMessageDialog(null, "Programa encerrado pelo usuário");
                return;
            }

            int indice = Integer.parseInt(entrada);
            int valor = vetor.getValor(indice);

            JOptionPane.showMessageDialog(null, "Valor no índice " + indice + ": " + valor);

        } catch (IndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, "Índice inválido. O intervalo válido é de 0 a 4");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Digite apenas números inteiros");
        }
    }
}
