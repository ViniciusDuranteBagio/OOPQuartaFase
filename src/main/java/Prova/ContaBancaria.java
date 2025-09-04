package Prova;

import javax.swing.*;

public class ContaBancaria {

    private double saldo;
    private String titular;

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double deposito(double deposito) {
        if (deposito > 0) {
            saldo += deposito;
        } else {
            System.out.println("O valor do deposito deve ser maior que zero");
        }
        return saldo;
    }

    public double sacar(double sacar) {
        if (sacar <= saldo) {
            saldo -= sacar;
        } else {
            System.out.println("O valor do saque é menor que o valor que você possui na sua conta");
        }
        return saldo;
    }

    void exibirSaldo() {
        System.out.println(saldo);
    }
}