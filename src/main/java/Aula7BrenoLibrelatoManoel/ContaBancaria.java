package Aula7BrenoLibrelatoManoel;

public class ContaBancaria {
    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
        // se for negativo, não faz nada
    }
}