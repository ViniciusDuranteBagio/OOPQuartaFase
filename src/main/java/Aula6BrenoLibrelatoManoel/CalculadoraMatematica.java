package Aula6BrenoLibrelatoManoel;

import javax.swing.JOptionPane;

public class CalculadoraMatematica {
    public double raizQuadrada(double numero) {
        if (numero < 0) throw new ArithmeticException("Não existe raiz de número negativo!");
        return Math.sqrt(numero);
    }

    public static void main(String[] args) {
        CalculadoraMatematica calc = new CalculadoraMatematica();

        try {
            double num = Double.parseDouble(JOptionPane.showInputDialog("Digite um número:"));
            double resultado = calc.raizQuadrada(num);
            JOptionPane.showMessageDialog(null, "Raiz quadrada: " + resultado);

        } catch (ArithmeticException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Valor inválido!");
        }
    }
}