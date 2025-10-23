import java.util.Scanner;

public class Conversor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        boolean valido = false;

        while (!valido) {
            System.out.print("Digite um número inteiro: ");
            String entrada = sc.nextLine();
            try {
                numero = Integer.parseInt(entrada);
                valido = true;
            } catch (Exception e) {
                System.out.println("Valor inválido, tente novamente!");
            }
        }
        System.out.println("Número digitado: " + numero);
    }
}