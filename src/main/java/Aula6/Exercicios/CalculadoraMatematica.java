import java.util.Scanner;

public class CalculadoraMatematica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        double num = sc.nextDouble();

        if (num < 0) {
            System.out.println("Erro: não existe raiz real de número negativo!");
        } else {
            System.out.println("Raiz quadrada: " + Math.sqrt(num));
        }
    }
}