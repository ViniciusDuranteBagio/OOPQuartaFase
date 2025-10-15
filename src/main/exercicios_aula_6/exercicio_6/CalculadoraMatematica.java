package exercicio_6;

class CalculadoraMatematica {

    public double calcularRaizQuadrada(double numero) throws IllegalArgumentException {
        if (numero < 0) {
            throw new IllegalArgumentException("Não é possível calcular a raiz quadrada de número negativo");
        }
        return Math.sqrt(numero);
    }
}
