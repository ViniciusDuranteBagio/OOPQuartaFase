package Prova;

public class ContaBancaria {
    private String titular;
    private double saldo = 0;

    public ContaBancaria(String titular, double saldo) {
        if (saldo < 0) {
            System.out.println("Saldo inválido!");
            return;
        }
        this.titular = titular;
        this.saldo = saldo;
        System.out.println("Conta criada!\nTitular: " + titular + "\nSaldo: " + saldo);
    }

    public void depositar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor inválido!");
            return;

        }
        saldo += valor;
        System.out.println("O valor de " + valor + " foi depositado com sucesso!");
    }
    public void sacar(double valor) {
        if(valor <= saldo) {
            saldo -=valor;
            System.out.println("O valor de " + valor + " foi sacado com sucesso!");
        } else {
            System.out.println("Saldo insuficiente!");
        }

    }
    public void exibirSaldo() {
        System.out.println("Titular: " + titular + "\nSaldo: " + saldo);
    }
}