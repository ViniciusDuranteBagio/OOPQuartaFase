import javax.swing.*;

public class ContaBancaria {
    private int numeroConta;
    private double saldo;
    private String titular;

    public ContaBancaria(int numeroConta, String titular) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = 0.0;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void depositar(double valor) {
        if (valor <= 0) {
            JOptionPane.showMessageDialog(null, "Erro no depósito, insira um valor válido");
        } else {
            saldo += valor;
            JOptionPane.showMessageDialog(null, "Depósito realizado");
        }
    }

    public void sacar(double valor) {
        if (valor <= 0) {
            JOptionPane.showMessageDialog(null, "Valor inválido para saque.");
        } else if (valor > saldo) {
            JOptionPane.showMessageDialog(null, "Saldo insuficiente para o saque");
        } else {
            saldo -= valor;
            JOptionPane.showMessageDialog(null, "Saque realizado");
        }
    }

    public void exibirSaldo() {
        JOptionPane.showMessageDialog(null, "O seu saldo é: R$ " + saldo);
    }
}