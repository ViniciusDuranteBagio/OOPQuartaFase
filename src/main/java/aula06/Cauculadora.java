package aula06;

public class Cauculadora {
    public double dividir(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Não é possível dividir por zero!");
        }
        return a / b;
    }
}
