import java.util.Scanner;

public class ValidadorDocumento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o CPF (11 dígitos): ");
        String cpf = sc.nextLine();

        if (cpf.length() == 11) {
            System.out.println("CPF válido!");
        } else {
            System.out.println("Erro: CPF inválido! Deve ter 11 números.");
        }
    }
}