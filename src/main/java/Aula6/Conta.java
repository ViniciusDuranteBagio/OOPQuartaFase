package Aula6;

import javax.swing.*;

public class Conta {
    private double saldo;

    public Conta(double saldoInicial) {
        saldo = saldoInicial;
    }

    public void sacar(double valor) {
        try {
            if (valor > saldo) {
                throw new SaldoInsuficienteException("Saldo insuficiente para o saque.");
            }
            saldo -= valor;
            JOptionPane.showMessageDialog(null, "Saque realizado. Saldo atual: " + saldo);
        } catch (SaldoInsuficienteException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}