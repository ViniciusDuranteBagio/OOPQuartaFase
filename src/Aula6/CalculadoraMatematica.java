package Aula6;

public class CalculadoraMatematica {
    public double calcularRaiz(double valor) {
        if (valor < 0) {
            throw new IllegalArgumentException("Número negativo! Não é possível calcular a raiz.");
        }
        return Math.sqrt(valor);
    }
}
