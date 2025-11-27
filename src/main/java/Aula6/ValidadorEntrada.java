public class ValidadorEntrada {
    public int validarPositivo(int n) {
        if (n < 0) throw new IllegalArgumentException("O número deve ser positivo!");
        return n;
    }
}