import java.util.Scanner;

    class CalculadoraMatematica {
        public double raizQuadrada(double numero) {
            if (numero < 0) {
                throw new IllegalArgumentException("Não é possível calcular raiz de número negativo!");
            }
            return Math.sqrt(numero);
        }
}
