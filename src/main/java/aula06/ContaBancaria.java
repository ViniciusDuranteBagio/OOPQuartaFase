package aula06;

public class ContaBancaria {
    private double saldo;

    public ContaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) throws IllegalArgumentException {
        if (valor < 0) {
            throw new IllegalArgumentException("Valor de depósito não pode ser negativo!");
        }
        saldo += valor;
    }

    public void sacar(double valor) throws IllegalArgumentException {
        if (valor > saldo) {
            throw new IllegalArgumentException("Saldo insuficiente para saque!");
        }
        saldo -= valor;
    }

    public double getSaldo() {
        return saldo;
    }
}
