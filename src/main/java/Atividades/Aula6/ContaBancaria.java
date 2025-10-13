package Atividades.Aula6;

public class ContaBancaria {
    private double saldo;

    public ContaBancaria() {
        this.saldo = 0.0;
    }

    public void depositar(double valor) throws ValorInvalidoException {
        if (valor < 0) {
            throw new ValorInvalidoException("Erro: O valor depositado não pode ser negativo.");
        }
        saldo += valor;
        System.out.println("Depósito realizado com sucesso! Saldo atual: R$ " + saldo);
    }

    public void sacar(double valor) throws ValorInvalidoException {
        if (valor > saldo) {
            throw new ValorInvalidoException("Erro: Saldo insuficiente para realizar o saque.");
        }
        saldo -= valor;
        System.out.println("Saque realizado com sucesso! Saldo atual: R$ " + saldo);
    }

    public double getSaldo() {
        return saldo;
    }
}
