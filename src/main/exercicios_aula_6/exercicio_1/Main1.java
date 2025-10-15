package exercicio_1;

import javax.swing.*;

public class Main1 {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        try {
            String input1 = JOptionPane.showInputDialog("Digite o numerador:");
            double num1 = Double.parseDouble(input1);

            String input2 = JOptionPane.showInputDialog("Digite o denominador:");
            double num2 = Double.parseDouble(input2);

            double resultado = calc.dividir(num1, num2);

            JOptionPane.showMessageDialog(null, "Resultado: " + resultado);

        } catch (ArithmeticException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Digite apenas números");
        }
    }
}

