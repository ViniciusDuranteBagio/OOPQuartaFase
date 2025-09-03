package Prova;

public class ContaBancaria {

    String titular;
    double saldo;

    public void depositar(double valor) {
        if (valor <= 0) {
            System.out.println("Erro. Insira valor válido.");
        } else {
            saldo += valor;
            System.out.println("Depósito realizado com sucesso.");
        }
    }

    public void sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Erro. Insira valor válido.");
        } else if (valor > saldo) {
            System.out.println("Saldo insuficiente. Insira valor válido.");
        } else {
            saldo -= valor;
            System.out.println("Saque realizado com sucesso.");

        }
    }
    public void exibirSaldo() {
        System.out.println("O seu saldo é: R$ " + saldo);
    }
}
