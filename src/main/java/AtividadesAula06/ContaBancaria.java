package AtividadesAula06;

import java.awt.event.ContainerAdapter;

public class ContaBancaria {

    private String titular;
    private double saldo;

    public ContaBancaria (String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;

    }

    public void depositar (double valor) throws ValorInvalidoException {
        if (valor <= 0) {
            throw new ValorInvalidoException("Valor do depósito deve ser positivo");
        }
        saldo += valor;
        System.out.println("Depósito: R$" + valor + " depositado com sucesso.");
        System.out.println("Saldo atual: R$" + saldo);
    }
    public void sacar (double valor) throws ValorInvalidoException, SaldoInsuficienteException {
        if (valor <=0) {
            throw new ValorInvalidoException("Valor deve ser positivo");

        }

        if (valor > saldo) {
            throw  new SaldoInsuficienteException("Saldo insuficiente para saque");

        }
        saldo -= valor;
        System.out.println("Saque: R$" + valor + " sacado com sucesso.");
        System.out.println("Saldo atual: R$" + saldo);
    }

    public void transferir (ContaBancaria destino, double valor) throws ValorInvalidoException, SaldoInsuficienteException {
        if (valor <= 0) {
            throw new ValorInvalidoException("Valor da transferência deve ser positivo");
        }

        if (valor > saldo) {
            throw new SaldoInsuficienteException("Saldo insuficiente para transferência");
        }
        this.saldo -= valor;
        destino.saldo += valor;

        System.out.println("Transferencia de R$" + valor + " realizada para " + destino.titular);
    }

    public double getSaldo() {
        return saldo;
    }
}

