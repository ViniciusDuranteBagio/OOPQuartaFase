package Aula6.exercicio6;

public class CalculadoraMatematica {
    public double raiz(double valor) throws IllegalArgumentException {
        if (valor < 0) throw new IllegalArgumentException("Não é possível calcular raiz de número negativo!");
        return Math.sqrt(valor);
    }
}