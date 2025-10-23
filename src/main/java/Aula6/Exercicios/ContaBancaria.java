import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double saldo = 200;

        System.out.print("Valor a depositar: ");
        double deposito = sc.nextDouble();

        if (deposito < 0) {
            System.out.println("Erro: valor de depósito não pode ser negativo!");
            return;
        }
        saldo += deposito;

        System.out.print("Valor a sacar: ");
        double saque = sc.nextDouble();

        if (saque > saldo) {
            System.out.println("Erro: saldo insuficiente!");
        } else {
            saldo -= saque;
            System.out.println("Transação concluída! Saldo final: " + saldo);
        }
    }
}