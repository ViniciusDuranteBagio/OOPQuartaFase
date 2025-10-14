package Aula06;

public class Operacoes {
    public int toInt(String string) {
        return Integer.parseInt(string);
    }
    public int dividir(int a, int b) {
        if (b == 0)
            throw new ArithmeticException("Nao e possivel dividir por zero.");
            return a / b;
    }
}
