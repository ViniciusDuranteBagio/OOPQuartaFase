package Aula4;

public class ContaBancaria {
    String titular;
    double saldo;

    public ContaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public void exibeDetalhes() {
        System.out.println("Titular: " + titular + "\nSaldo: " + saldo);
    }
}
