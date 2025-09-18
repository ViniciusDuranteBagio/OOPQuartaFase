package Aula3.Atividade;

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

    public void depositar(double valor) {
        if (valor < 0) {
            valor = 0;
            System.out.println("Valor para depósito deve ser maior que zero.");

        }
        saldo += valor;
        System.out.println("Depósito de R$ " + valor + " realizado com sucesso!");
    }

    public void sacar(double valor) {
        if (saldo > valor) {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso!");
        } else {
            System.out.println("Saldo insuficiente");
        }
    }
    public void exibirSaldo(){
        System.out.println("Saldo atual: R$ " + this.saldo);
    }
}


