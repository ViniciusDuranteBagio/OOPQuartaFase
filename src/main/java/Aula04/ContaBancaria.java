package Aula04;

public class ContaBancaria {
    protected String titular;
    protected double saldo;

    public ContaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public void exibirInformacoes() {
        System.out.println("Titular: " + this.titular);
        System.out.println("Saldo: " + this.saldo);
    }
}
