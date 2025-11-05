package org.example;

public class CalculadoraMatematica {
    public double raizQuadrada(double valor) {
        if (valor < 0) {
            throw new ArithmeticException("Não é possível calcular raiz de número negativo!");
        }
        return Math.sqrt(valor);
    }
}

