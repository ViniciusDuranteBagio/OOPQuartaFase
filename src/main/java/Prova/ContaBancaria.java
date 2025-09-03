package Prova;

public class ContaBancaria {

    private String titular;
    private double saldo;

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor de depósito deve ser positivo.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0) {
            if (valor <= saldo) {
                saldo -= valor;
                System.out.println("Saque de R$ " + valor + " realizado com sucesso.");
            } else {
                System.out.println("Saldo insuficiente para saque.");
            }
        } else {
            System.out.println("Valor de saque deve ser positivo.");
        }
    }

}