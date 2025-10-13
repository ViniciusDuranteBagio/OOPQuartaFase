package Atividades.Aula6;

public class CalculadoraMatematica {

    public double calcularRaizQuadrada(double numero) throws IllegalArgumentException {
        if (numero < 0) {
            throw new IllegalArgumentException("Erro: Não é possível calcular a raiz quadrada de um número negativo.");
        }
        return Math.sqrt(numero);
    }
}
