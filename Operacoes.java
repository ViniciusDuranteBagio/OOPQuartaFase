package Aula6;

public class Operacoes {

    public int converterParaInteiro(String s) throws NumberFormatException {
        return Integer.parseInt(s);
    }

    public double dividir(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Não é possível dividir por zero");
        }
        return (double) a / b;
    }

    public static void main(String[] args) {
        Operacoes op = new Operacoes();
        String texto = "10";
        String divisor = "0";

        try {
            int numerador = op.converterParaInteiro(texto);
            int denominador = op.converterParaInteiro(divisor);
            double resultado = op.dividir(numerador, denominador);
            System.out.println("Resultado: " + resultado);
        } catch (NumberFormatException e) {
            System.out.println("Erro de conversão: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Erro de divisão: " + e.getMessage());
        }
    }
}
