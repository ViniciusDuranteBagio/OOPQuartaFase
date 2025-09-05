package Prova;

public class ContaBancaria {
    private String titular;
    private double saldo;

    public ContaBancaria(String titular){
        this.titular = titular;
        this.saldo = 0.0;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado com sucesso!");
        } else {
            System.out.println("Erro: Valor para depósito deve ser maior que zero.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0) {
            if (this.saldo >= valor) {
                this.saldo -= valor;
                System.out.println("Saque de R$ " + valor + " realizado com sucesso!");
            } else {
                System.out.println("Erro: Saldo insuficiente para realizar o saque.");
            }
        } else {
            System.out.println("Erro: Valor para saque deve ser maior que zero.");
        }
    }

    public void exibirSaldo() {
        System.out.println("Saldo atual da conta: R$ " + this.saldo);
    }
}
