public class CalculadoraMatematica {
    public double raizQuadrada(double n) {
        if (n < 0) throw new ArithmeticException("Não existe raiz real de número negativo!");
        return Math.sqrt(n);
    }
}