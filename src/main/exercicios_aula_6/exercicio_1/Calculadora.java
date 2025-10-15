package exercicio_1;

public class Calculadora {
    public double dividir(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Erro: Não é possível realizar uma divisão por 0");
        }
        return a / b;
    }
}
