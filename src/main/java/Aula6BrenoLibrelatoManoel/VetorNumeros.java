package Aula6BrenoLibrelatoManoel;

import javax.swing.JOptionPane;

public class VetorNumeros {
    private int[] numeros = {10, 20, 30, 40, 50};

    public int getNumero(int indice) {
        return numeros[indice];
    }

    public static void main(String[] args) {
        VetorNumeros vetor = new VetorNumeros();

        try {
            int indice = Integer.parseInt(JOptionPane.showInputDialog(
                    "Digite um índice (0 a 4):"));

            int valor = vetor.getNumero(indice);
            JOptionPane.showMessageDialog(null, "Valor: " + valor);

        } catch (ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, "Índice inválido! Use de 0 a 4.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Digite um número válido!");
        }
    }
}