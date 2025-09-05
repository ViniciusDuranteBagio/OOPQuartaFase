package Prova;

public class ContaBancaria {
    String titular;
    double saldo;

    void depositar(double valor) {
        if (saldo >= 0) {
            saldo += valor;
            System.out.println(" Depósito realizado com sucesso " + saldo);

        } else {
            System.out.println(" Erro depósito invalido ");
        }
    }

    void sacar(double valor) {
        if (saldo >= 0) {
            saldo -= valor;
            System.out.println(" Saque realizado com sucesso " + saldo);

        } else {
            System.out.println(" Erro saque invalido ");
        }
    }
}