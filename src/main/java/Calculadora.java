public class Calculadora {
    public double divisão(double numero1, double numero2) throws ArithmeticException {
        if (numero2 == 0) {
            throw new ArithmeticException("não é possível dividir por zero!");
        }
        return numero1 / numero2;
    }
}
