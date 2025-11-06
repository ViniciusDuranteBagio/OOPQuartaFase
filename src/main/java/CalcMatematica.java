public class CalcMatematica {
    public double calcularRaiz(double numero) throws Exception {
            if (numero < 0) {
                throw new Exception("Não é possível calcular a raiz quadrada de número negativo!");
            }
            return Math.sqrt(numero);
    }
}
