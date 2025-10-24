package Aula6BrenoLibrelatoManoel;

import javax.swing.*;

public class Calculadora {
    public double dividir(double dividendo, double divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("Não é possível dividir por zero!");
        }
        return dividendo / divisor;
    }

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        try {
            double n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número:"));
            double n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número:"));

            double resultado = calc.dividir(n1, n2);
            JOptionPane.showMessageDialog(null, "Resultado: " + resultado);

        } catch (ArithmeticException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Valor inválido!");
        }
    }
}