package AtividadesAula06;

public class Operacoes {

    public static int converterTextoParaNumero(String texto) throws NumberFormatException {
        return Integer.parseInt(texto);
    }

    public static double dividir(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Erro: não é possível dividir por 0");
        }
        return (double) a / b;
    }
}
