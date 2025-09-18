package Aula_3_Breno;

public class ContaBancaria {

    private int numeroConta;
    private double saldo;
    private String titular;

    public void setNumeroConta(int numeroConta) {
        if (numeroConta >= 0) {
            this.numeroConta = numeroConta;
        } else {
            System.out.println("Numero da conta invalido");
        }
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getTitular() {
        return titular;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
        } else {
            System.out.println("Valor invalido");
        }
    }

    public void sacar(double valor) {
        if (valor <= saldo) {
            this.saldo -= valor;
        } else {
            this.saldo -= valor;
            System.out.println("Saldo insuficiente");
        }
    }

    public void exibirSaldo() {
        if (saldo < 0) {
            System.out.println("Saldo negativo");
        } else {
            System.out.println("Titular: " + titular + "\nConta numero: " + numeroConta + "\nSaldo atual: " + saldo);
        }
    }
}