package AtividadesAula6;

import javax.swing.*;

public class Calculadora {
    public static void main(String[] args) {

        int dividendo = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o dividendo"));
        int divisor   = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o divisor"));

        try {
            double divisao = dividendo/divisor;
            System.out.println("Resultado: " + divisao);
        } catch (ArithmeticException e) {
            System.out.println("Erro: divisão por zero");
        }
    }
}
