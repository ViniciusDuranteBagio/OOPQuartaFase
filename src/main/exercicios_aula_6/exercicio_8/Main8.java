package exercicio_8;

import javax.swing.*;

public class Main8 {
    public static void main(String[] args) {
        Operacoes op = new Operacoes();

        try {
            String texto1 = JOptionPane.showInputDialog("Digite o primeiro número:");
            if (texto1 == null) {
                JOptionPane.showMessageDialog(null, "Programa encerrado pelo usuário");
                return;
            }
            double num1 = op.converterParaNumero(texto1);

            String texto2 = JOptionPane.showInputDialog("Digite o segundo número:");
            if (texto2 == null) {
                JOptionPane.showMessageDialog(null, "Programa encerrado pelo usuário");
                return;
            }
            double num2 = op.converterParaNumero(texto2);

            double resultado = op.dividir(num1, num2);

            JOptionPane.showMessageDialog(null, "Resultado da divisão: " + resultado);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Digite apenas números");
        } catch (ArithmeticException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}
