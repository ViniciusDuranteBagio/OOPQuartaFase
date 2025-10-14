package AtividadesAula06;

public class CalculadoraMatematica {

    public double calcularRaizQuadrada (double numero) throws IllegalArgumentException {
        if (numero < 0) {
            throw new IllegalArgumentException("Erro. Não é possível calcular a raiz quadrada de numeros negativos");
        }
        return Math.sqrt(numero);
        }
    }

