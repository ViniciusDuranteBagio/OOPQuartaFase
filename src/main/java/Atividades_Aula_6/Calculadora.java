package Atividades_Aula_6;

public class Calculadora {

    public double dividir(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Não é possível dividir por zero");
        }
        return a / b;
    }

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        try {
            System.out.println("Resultado: " + calc.dividir(10, 2));
            System.out.println("Resultado: " + calc.dividir(10, 0));
        } catch (ArithmeticException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
