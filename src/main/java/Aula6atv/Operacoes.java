package Aula6atv;

public class Operacoes {
    public int converterParaNumero(String texto) throws NumberFormatException {
        return Integer.parseInt(texto);
    }

    public double dividir(int numerador, int denominador) throws ArithmeticException {
        return (double) numerador / denominador;
    }
}
