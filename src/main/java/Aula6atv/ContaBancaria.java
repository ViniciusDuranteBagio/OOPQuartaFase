package Aula6atv;

public class ContaBancaria {
    private double saldo;

    public ContaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) throws ValorInvalidoException {
        if (valor <= 0) {
            throw new ValorInvalidoException("Erro: o valor do depósito deve ser positivo!");
        }
        saldo += valor;
        System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
    }

    public void sacar(double valor) throws SaldoInsuficienteException {
        if (valor > saldo) {
            throw new SaldoInsuficienteException("Erro: saldo insuficiente para realizar o saque!");
        }
        saldo -= valor;
        System.out.println("Saque de R$" + valor + " realizado com sucesso.");
    }

    public double getSaldo() {
        return saldo;
    }
}
