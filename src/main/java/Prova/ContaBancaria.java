package Prova;

import javax.swing.*;

public class ContaBancaria {
    String titular;
    double saldo;

    public ContaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        if (valor <= 0) {
            System.out.println("Erro no depósito, insira um valor válido");
        } else {
            saldo += valor;
            System.out.println("Depósito realizado");
        }
    }

    public void sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor inválido para saque.");
        } else if (valor > saldo) {
            System.out.println("Saldo insuficiente para o saque");
        } else {
            saldo -= valor;
            System.out.println("Saque realizado");
        }
    }

    public void exibirSaldo() {
        System.out.println("O seu saldo é: R$ " + saldo);
    }
}

