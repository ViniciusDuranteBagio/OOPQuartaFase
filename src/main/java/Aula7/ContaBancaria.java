package Aula7;

public class ContaBancaria {

    private double saldo = 0;

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }

    public double getSaldo() {
        return saldo;
    }
}