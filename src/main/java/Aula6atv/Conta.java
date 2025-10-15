package Aula6atv;

public class Conta {
    private double saldo;

    public Conta(double saldo){
        this.saldo = saldo;
    }

    public void sacar(double valor) throws SaldoInsuficienteException {
        if (valor > saldo) {
            throw new SaldoInsuficienteException("Erro: Saldo insuficiente para realizar o saque!");
        }
        saldo -= valor;
        System.out.println("Saque realizado com sucesso! Novo saldo: R$ " + saldo);
    }

    public double getSaldo() {
        return saldo;
    }



}
