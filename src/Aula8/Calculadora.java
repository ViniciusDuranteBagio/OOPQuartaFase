package Aula8;

public class Calculadora {
    public double elevarAoQuadrado(int a) {
        return a * a;
    }

    public double somarNumero(int a, int b) {
        return a + b;
    }

    public double subtrairNumero(int a, int b) {
        return  a - b;
    }

    public double multiplicarNumero(int a, int b) {
        return a * b;
    }

    public double dividirNumero(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Impossível dividir por zero");
        } else {
            return (double) a / b;
        }
    }

}


