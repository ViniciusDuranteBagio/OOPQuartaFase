package Prova;

public class ContaBancaria {
    String titular;
    double saldo;

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
        }
    }

    public void mostrarSaldo() {
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: R$" + saldo);
    }

}
