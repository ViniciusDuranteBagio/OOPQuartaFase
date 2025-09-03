package Prova;

public class ContaBancaria {

    private double saldo;
    private String titular;

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
            this.saldo += valor;
            System.out.println("Depositado R$ " + valor + " com sucesso!");
        } else {
            System.out.println("Valor invalido!");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            this.saldo -= valor;
            System.out.println("Sacado R$ " + valor + " com sucesso!");
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    public void exibirSaldo() {
        System.out.println("Saldo atual: " + this.saldo);
    }
}