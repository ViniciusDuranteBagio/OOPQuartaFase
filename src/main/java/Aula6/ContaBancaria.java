package Aula6;

import javax.swing.*;

public class ContaBancaria {
    private double saldo;

    public ContaBancaria(double saldoInicial) {
        saldo = saldoInicial;
    }

    public void depositar(double valor) {
        try {
            if (valor < 0) throw new IllegalArgumentException("Depósito não pode ser negativo.");
            saldo += valor;
            JOptionPane.showMessageDialog(null, "Depósito realizado. Saldo: " + saldo);
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public void sacar(double valor) {
        try {
            if (valor > saldo) throw new SaldoInsuficienteException("Saldo insuficiente para saque.");
            saldo -= valor;
            JOptionPane.showMessageDialog(null, "Saque realizado. Saldo: " + saldo);
        } catch (SaldoInsuficienteException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}