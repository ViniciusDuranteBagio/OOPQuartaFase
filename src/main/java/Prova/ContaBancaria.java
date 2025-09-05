package Prova;

public class ContaBancaria {
    String titular;
    double saldo;

    void depositar(double valor) {
        saldo += valor;
        System.out.println("\nUm depósito de R$" + valor + " foi realizado com sucesso!");
    }

    void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("\nUm Saque de R$" + valor + " foi realizado com sucesso!");
        } else {
            System.out.println("\nSaldo não pode ser negativo!");
        }
    }
}