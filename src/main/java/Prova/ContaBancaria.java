package Prova;

public class ContaBancaria {

    public String titular;
    private double saldo;

    public double sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor de saque inválido.");
        } else if (valor > saldo) {
            System.out.println("Saldo insuficiente.");
        } else {
            saldo -= valor;
            System.out.println("Saldo após o saque: " + saldo + " R$");
        }
        return saldo;
    }

    public double depositar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor de depósito inválido.");
        } else {
            saldo += valor;
            System.out.println("Saldo após o depósito: " + saldo + " R$.");
        }
        return saldo;
    }

    public void mostrarInformacoes() {
        System.out.println("--------------------");
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: " + saldo + " R$");
        System.out.println("--------------------");
    }
}
