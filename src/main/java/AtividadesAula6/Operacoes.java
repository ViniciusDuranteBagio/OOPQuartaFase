package AtividadesAula6;

import javax.swing.*;

public class Operacoes {
    public static void main(String[] args) {

        boolean parar = false;

        while (!parar){
            try {
                int dividendo = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o dividendo"));
                int divisor   = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o divisor"));

                double divisao = dividendo/divisor;

                JOptionPane.showMessageDialog(null, "Resultado: " + divisao);
                parar = true;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Erro: valor não é um número! Tente novamente.");
            } catch (ArithmeticException e) {
                JOptionPane.showMessageDialog(null, "Erro: divisão por zero! Tente novamente.");
            }
        }
    }
}
