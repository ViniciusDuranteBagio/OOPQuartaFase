package Aula6.exercicio1;

public class Main {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        double num1 = 10;
        double num2 = 0;

        try {
            double resultado = calc.dividir(num1, num2);
            System.out.println("Resultado da divisão: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }


    }
}




