package Aula6;

import javax.swing.*;

public class Conta {
    private double saldo;
    private double vlrPix;

    public Conta(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void setVlrPix (double vlrPix) throws SaldoInsuficienteException {
        if (vlrPix >= saldo) {
            throw new SaldoInsuficienteException("Saldo insuficiente");
        }
        saldo -= vlrPix;
    }
    public double getSaldo() {
        return saldo;
    }

    public static void main(String[] args) {
        Conta contaSaque = new Conta(1000);

        try {
            contaSaque.setVlrPix(500);
            JOptionPane.showMessageDialog(null, "Saque realizado!" +
                    "\nSaldo atual: " + contaSaque.getSaldo());
            contaSaque.setVlrPix(600);
        } catch (SaldoInsuficienteException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
        }
    }
}
