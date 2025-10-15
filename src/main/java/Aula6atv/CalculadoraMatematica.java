package Aula6atv;

public class CalculadoraMatematica {

    public double calcularRaizQuadrada(double numero) throws IllegalArgumentException {
        if (numero < 0) {
            // lança exceção se o número for negativo
            throw new IllegalArgumentException("Erro: não é possível calcular a raiz quadrada de número negativo!");
        }
        return Math.sqrt(numero); // calcula a raiz quadrada se o número for válido
    }

}
