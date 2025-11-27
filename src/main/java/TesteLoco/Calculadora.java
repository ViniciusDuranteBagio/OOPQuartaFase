package TesteLoco;

public class Calculadora {
    public Calculadora() {

    }

    public double elevarAoQuadrado(int i) {
        return i * i;
    }
    public double subtrair (int a, int b) {
        return a - b;
    }

    public double multiplicar (int p, int q) {
        return p * q;
    }

    public double dividir (int c, int d) {
        if (d == 0 ) {
            throw new ArithmeticException("Não pode dividir por zero");
        }
        return (double) c / d;
    }

}