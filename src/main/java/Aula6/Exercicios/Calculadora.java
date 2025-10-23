import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o dividendo: ");
        double a = sc.nextDouble();
        System.out.print("Digite o divisor: ");
        double b = sc.nextDouble();

        try {
            double resultado = a / b;
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Erro: não é possível dividir por zero!");
        }
    }
}