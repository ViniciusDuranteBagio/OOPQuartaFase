package Aula8;

import javax.swing.*;

public class Calculadora {
    private int a;
    private int b;

    //1
    public int somar(int a, int b) {
        return a + b;
    }
    //2
    public int subtrair(int a, int b) {
        return a - b;
    }
    //3
    public int multiplicar(int a, int b) {
        return a * b;
    }
    public int dividir(int a, int b) {
        return a / b;
    }
    //4 juntando com o calculo de dividir da número 3
    public static void main(String[] args) {

        try {
            Calculadora calculadora = new Calculadora();
            calculadora.dividir(10, 0);

        }catch(ArithmeticException e) {
            JOptionPane.showMessageDialog(null,"Erro, não tem como calcular");
            e.printStackTrace();
        }
    }

}
