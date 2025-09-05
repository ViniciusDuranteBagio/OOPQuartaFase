package Prova;

public class ContaBancaria {
    private String titular;
    private int saldo;

    public ContaBancaria (String nomeTitular, int saldoConta) {
        this.titular = nomeTitular;
        this.saldo = saldoConta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        if (valor < 0) {
            valor = 0;
        }
        this.saldo += valor;
    }

    public void sacar(double valor) {
        if (this.saldo < valor) {
            System.out.println("Valor do saldo é insuficiente");
        } else if (valor < 0) {
            System.out.println("Valor de saque inválido");
        } else {
            this.saldo -= valor;
        }
    }

    public void exibirSaldo() {
        System.out.println(titular + " o saldo da sua conta é de: R$" + saldo);
    }
}
