package exercicio_2;

import javax.swing.*;

public class Main2 {
    public static void main(String[] args) {

        Conversor conversor = new Conversor();
        int numero = 0;
        boolean valido = false;


        while (!valido) {
            String entrada = JOptionPane.showInputDialog("Digite um número inteiro:");

            try {
                numero = conversor.conversor(entrada);
                valido = true;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Digite apenas números inteiros");
            } catch (NullPointerException e) {
                JOptionPane.showMessageDialog(null, "Operação cancelada");
                return;
            }

            JOptionPane.showMessageDialog(null, "Você digitou o número: " + numero);
        }
    }
}