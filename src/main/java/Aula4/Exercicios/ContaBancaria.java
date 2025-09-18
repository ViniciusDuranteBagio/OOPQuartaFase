package Aula4.Exercicios;

public class ContaBancaria {
    public String titular;
    public double saldo;

    public ContaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public void exibirDetalhes() {
        System.out.println("Titular: " + titular + " | Saldo: R$" + saldo);
    }
}
