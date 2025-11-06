package AtividadesAula6;

import javax.swing.*;

public class CalculadoraMatematica {
    public static void main(String[] args) {

        double numero = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o número pra calcular a raiz quadrada"));

        try {
            if (numero < 0) {
                throw new IllegalArgumentException();
            }

            double resultado = Math.sqrt(numero);
            System.out.println("Resultado: " + resultado);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: número negativo");
        }
    }
}
