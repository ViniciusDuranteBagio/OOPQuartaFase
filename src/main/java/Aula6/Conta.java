package Atvd_aula6;

public class Conta {
    double saldo;

    public Conta(double saldoInicial){
        this.saldo = saldoInicial;
    }

    public void sacar (double valor) throws SaldoInsuficienteException {
        if (valor > saldo) {
            throw new SaldoInsuficienteException("Saldo não disponível para saque de " + valor);
        } else {
            saldo -= valor;
            System.out.println("Saque realizado.");
        }
    }
}
