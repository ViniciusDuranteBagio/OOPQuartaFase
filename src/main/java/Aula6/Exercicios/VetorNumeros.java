import java.util.Scanner;

public class VetorNumeros {
    public static void main(String[] args) {
        int[] numeros = {10, 20, 30, 40, 50};
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um índice (0 a 4): ");
        int indice = sc.nextInt();

        try {
            System.out.println("Valor: " + numeros[indice]);
        } catch (Exception e) {
            System.out.println("Erro: índice inválido! Deve estar entre 0 e 4.");
        }
    }
}