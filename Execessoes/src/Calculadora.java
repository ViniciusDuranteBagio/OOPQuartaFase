public class Calculadora {
    public double dividir(double a, double b) {
        double resultado = 0;
        try {
            resultado = a / b;
        } catch (ArithmeticException e) {
        }
        return resultado;
    }
}