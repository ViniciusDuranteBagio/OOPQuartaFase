import java.util.Scanner;

public class ValidadorEntrada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = -1;

        while (true) {
            System.out.print("Digite um número positivo: ");
            try {
                numero = Integer.parseInt(sc.nextLine());
                if (numero >= 0) break;
                else System.out.println("Erro: número negativo!");
            } catch (Exception e) {
                System.out.println("Valor inválido!");
            }
        }

        System.out.println("Número válido: " + numero);
    }
}