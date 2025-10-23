package Aula6;

public class Operacoes {
    public int converter(String valor) {
        return Integer.parseInt(valor);
    }

    public double dividir(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Divisão por zero!");
        }
        return a / b;
    }
}
