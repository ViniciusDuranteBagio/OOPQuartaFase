package Prova;

public class ContaBancaria {

    String titular;
    double saldo;

    public ContaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public void Depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("Foi depositado: " + valor);
        } else {
            System.out.println("O valor depositado deve ser positivo!");
        }

    }

    public void Sacar(double valor) {
        if (valor > 0) {
            if (valor <= this.saldo) ;
            this.saldo -= valor;
            System.out.println("saque de " + valor + " realizado!");
        } else {
            System.out.println("Saldo Insuficiente!");
        }

    }public void dadosconta(){
        System.out.println("titular: " + this.titular);
        System.out.println("Saldo: " + this.saldo);
    }

}

