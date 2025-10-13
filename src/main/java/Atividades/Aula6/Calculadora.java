package Atividades.Aula6;

public class Calculadora {

    public double dividir(double numerador, double divisor) throws ArithmeticException {
        if (divisor == 0) {
            throw new ArithmeticException("Não é possível dividir por zero.");
        }
        return numerador / divisor;
    }
}
