package Prova;

public class ContaBancaria {
    private String titular;
    private double saldo;

    public ContaBancaria(String titular, double saldo) {
        this.titular = titular;
        if (saldo >= 0.0) {
            this.saldo = saldo;
        } else {
            System.out.println("Erro, insira um saldo válido!");
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    public double depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
        } else {
            System.out.println("Deposite um valor válido!");
        }
        return valor;
    }
    public double sacar(double valor) {
        if (valor > 0) {
            this.saldo -= valor;
        } else {
            System.out.println("Saque um valor válido!");
        }
        return valor;
    }

    public void mostrarSaldo() {
        System.out.println("Titular: " + getTitular() + "\nSaldo: " + getSaldo());
    }
}
