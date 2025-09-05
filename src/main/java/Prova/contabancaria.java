package Prova;

public class contabancaria {


    private String titular;
    private double saldo;


    public void ContaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = Math.max(saldoInicial, 0);
    }
}