package Aula6;

import javax.swing.JOptionPane;

public class Calculadora {

    public void dividir() {
        try {
            int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o dividendo:"));
            int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o divisor:"));

            if (b == 0) {
                System.out.println("Erro: não é possível dividir por zero.");
                return;
            }

            double resultado = (double) a / b;
            System.out.println("Resultado da divisão: " + resultado);

        } catch (NumberFormatException e) {
            System.out.println("Erro: digite apenas números inteiros válidos.");
        }
    }
}