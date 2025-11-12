package exercicios_aula_5.exercicio_6;

import javax.swing.*;

public class Main6 {
    public static void main(String[] args) {
        CalculadoraMatematica calc = new CalculadoraMatematica();

        try {
            String entrada = JOptionPane.showInputDialog("Digite um número para calcular a raiz quadrada:");

            if (entrada == null) {
                JOptionPane.showMessageDialog(null, "Programa encerrado pelo usuário");
                return;
            }

            double numero = Double.parseDouble(entrada);
            double resultado = calc.calcularRaizQuadrada(numero);

            JOptionPane.showMessageDialog(null, "A raiz quadrada de " + numero + " é: " + resultado);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Digite apenas números");
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}
