import java.util.Scanner;

public class Pessoa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite sua idade: ");

        try {
            int idade = sc.nextInt();
            if (idade < 0) {
                System.out.println("Erro: idade não pode ser negativa!");
            } else {
                System.out.println("Idade cadastrada: " + idade);
            }
        } catch (Exception e) {
            System.out.println("Valor inválido!");
        }
    }
}