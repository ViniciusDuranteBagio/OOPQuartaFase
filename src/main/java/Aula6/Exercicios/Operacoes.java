import java.util.Scanner;

public class Operacoes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Digite o primeiro número: ");
            double a = Double.parseDouble(sc.nextLine());
            System.out.print("Digite o segundo número: ");
            double b = Double.parseDouble(sc.nextLine());

            if (b == 0) {
                System.out.println("Erro: não é possível dividir por zero!");
            } else {
                System.out.println("Resultado: " + (a / b));
            }
        } catch (Exception e) {
            System.out.println("Erro: digite apenas números válidos!");
        }
    }
}