package Aula6BrenoLibrelatoManoel;

import javax.swing.*;

public class Conta {
    private double saldo = 1000;

    public void sacar(double valor) throws SaldoInsuficienteException {
        if (valor > saldo) throw new SaldoInsuficienteException("Saldo insuficiente!");
        saldo -= valor;
    }

    public static void main(String[] args) {
        Conta conta = new Conta();

        try {
            double saque = Double.parseDouble(JOptionPane.showInputDialog(
                    "Saldo: R$ " + conta.saldo + "\nDigite valor do saque:"));

            conta.sacar(saque);
            JOptionPane.showMessageDialog(null, "Saque realizado! Novo saldo: R$ " + conta.saldo);

        } catch (SaldoInsuficienteException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Valor inválido!");
        }
    }
}