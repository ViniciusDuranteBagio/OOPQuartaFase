import java.util.Scanner;

public class Conta {
    public static void main(String[] args) {
        double saldo = 100.0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor do saque: ");
        double valor = sc.nextDouble();

        if (valor > saldo) {
            System.out.println("Erro: saldo insuficiente!");
        } else {
            saldo -= valor;
            System.out.println("Saque realizado! Saldo atual: " + saldo);
        }
    }
}