package Aula6;

public class CalculadoraMatematica {

    public double raizQuadrada(double valor) {
        if (valor < 0) {
            throw new IllegalArgumentException("Não é possível calcular raiz quadrada de número negativo");
        }
        return Math.sqrt(valor);
    }

    public static void main(String[] args) {
        CalculadoraMatematica calc = new CalculadoraMatematica();
        try {
            System.out.println("Raiz quadrada de 9: " + calc.raizQuadrada(9));
            System.out.println("Raiz quadrada de -1: " + calc.raizQuadrada(-1));
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
