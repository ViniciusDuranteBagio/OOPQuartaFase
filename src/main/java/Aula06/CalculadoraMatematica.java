package Aula06;

public class CalculadoraMatematica {
    double raiz(double n) {
        if (n < 0) throw new IllegalArgumentException("Número negativo");
        return Math.sqrt(n);
    }
}
