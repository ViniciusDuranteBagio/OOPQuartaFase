package Aula6;

public class Operacoes {
    public int converterParaInteiro(String s) throws NumberFormatException {
        return Integer.parseInt(s);
    }

    public double dividir(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Não é possível dividir por zero");
        }
        return (double) a / b;
    }
}
