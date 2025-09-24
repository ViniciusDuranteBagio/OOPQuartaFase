package org.org.example;

import org.example.ContaBancaria;

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria(1234);
        System.out.println(conta.getNumeroConta());
        System.out.println("saldo Atual:" + conta.getSaldo());
        conta.depositar(10);
        System.out.println("saldo Atual:" + conta.getSaldo());
        conta.sacar(20);
        System.out.println("saldo Atual:" + conta.getSaldo());
        conta.sacar(5);
        System.out.println("saldo Atual:" + conta.getSaldo());
    }
}