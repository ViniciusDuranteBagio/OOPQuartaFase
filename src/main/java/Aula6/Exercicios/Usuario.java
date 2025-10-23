import java.util.Scanner;

public class Usuario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();

        if (nome == null || nome.trim().isEmpty()) {
            System.out.println("Erro: nome não pode ser vazio!");
        } else {
            System.out.println("Nome cadastrado: " + nome);
        }
    }
}