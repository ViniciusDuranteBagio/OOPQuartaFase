package Prova;

public class ContaBancaria {

    private String titular;
    private Double saldo;

    public ContaBancaria(String titular) {
        this.titular = titular;
        this.saldo = 0.0;
    }


    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de dindin  " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor errado xuxu");
        }
    }


    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Deu erro, Voce esta sem dinheiro ou sistema fora");
        }
    }


    public void exibirSaldo() {
        System.out.println("Titular: " + titular);
        System.out.println("Saldo atual: " + saldo);
    }






}
