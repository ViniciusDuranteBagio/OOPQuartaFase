package org.example;

public class ContaBancaria {
    private double saldo;

    public ContaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) throws Exception {
        if (valor < 0) {
            throw new Exception("Não é possível depositar valor negativo!");
        }
        saldo += valor;
        System.out.println("Depósito de R$" + valor + " realizado. Saldo atual: R$" + saldo);
    }

    public void sacar(double valor) throws Exception {
        if (valor > saldo) {
            throw new Exception("Saldo insuficiente para saque!");
        }
        saldo -= valor;
        System.out.println("Saque de R$" + valor + " realizado. Saldo atual: R$" + saldo);
    }
}

