import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] usuarios = {
            {"admin", "1234"},
            {"user", "abcd"}
        };

        System.out.print("Usuário: ");
        String login = sc.nextLine();
        System.out.print("Senha: ");
        String senha = sc.nextLine();

        boolean achou = false;
        for (String[] u : usuarios) {
            if (u[0].equals(login)) {
                achou = true;
                if (u[1].equals(senha)) {
                    System.out.println("Login bem-sucedido!");
                } else {
                    System.out.println("Senha incorreta!");
                }
                break;
            }
        }

        if (!achou) {
            System.out.println("Usuário não encontrado!");
        }
    }
}