package Aula6BrenoLibrelatoManoel;

import javax.swing.JOptionPane;

public class Operacoes {
    public static void main(String[] args) {
        try {
            String texto1 = JOptionPane.showInputDialog("Digite o primeiro número:");
            String texto2 = JOptionPane.showInputDialog("Digite o segundo número:");

            int n1 = Integer.parseInt(texto1);
            int n2 = Integer.parseInt(texto2);

            int resultado = n1 / n2;
            JOptionPane.showMessageDialog(null, "Divisão: " + resultado);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Erro: Digite números válidos!");
        } catch (ArithmeticException e) {
            JOptionPane.showMessageDialog(null, "Erro: Não pode dividir por zero!");
        }
    }
}