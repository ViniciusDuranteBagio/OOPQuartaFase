package Heranca;

public class ContaBancaria {
    protected String titular;
    protected double saldo;

    public ContaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public void exibirDetalhes() {
        System.out.println("Titular: " + titular + ", Saldo: " + saldo);
    }
}
