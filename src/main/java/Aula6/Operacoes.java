public class Operacoes {
    public int converter(String texto) throws NumberFormatException {
        return Integer.parseInt(texto);
    }
    public double dividir(int a, int b) {
        if (b == 0) throw new ArithmeticException("Divisão por zero!");
        return a / (double) b;
    }
}