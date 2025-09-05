package Prova;

public class ContaBancaria {
    int numeroConta;
    double saldo;
    String titular;

    void depositar(double valor) {
        saldo += valor;
    }
    void sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }
}
