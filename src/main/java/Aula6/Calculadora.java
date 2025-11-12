package Aula6;

public class Calculadora {
    public double dividir(double num1, double num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Não é possível dividir por zero");
        } else {
            return num1 / num2;
        }
    }
}
