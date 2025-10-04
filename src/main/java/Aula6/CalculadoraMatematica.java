package Aula6;

public class CalculadoraMatematica {
    public double raizQuadrada(double valor) {
        if (valor < 0) {
            throw new IllegalArgumentException("Não é possível calcular raiz quadrada de um número negativo");
        }
        return Math.sqrt(valor);
    }
}