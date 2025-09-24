package Encapsulamento.pack1;

public class ContaBancaria {

    private final String numeroConta;
    private double saldo;
    private String titular;

    public ContaBancaria(String numeroConta, String titular, double saldoInicial) {

        this.numeroConta = numeroConta;
        this.titular = titular;
        if(saldoInicial >= 0) {
            this.saldo = saldoInicial;
        }else {
            this.saldo = 0;
        }
    }

    public String getNumeroConta() {
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

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor inválido para depósito!");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saque não permitido. Saldo insuficiente ou valor inválido.");
        }
    }

    public void exibirSaldo() {
        System.out.println("Saldo atual: R$" + saldo);
    }
}
