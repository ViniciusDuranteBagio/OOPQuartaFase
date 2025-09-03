package Prova;
public class ContaBancaria {
    private String titular;
    private double saldo;

    public ContaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        if (saldoInicial >= 0) {
            this.saldo = saldoInicial;
        } else {
            this.saldo = 0;
        }
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado. Novo saldo: R$" + saldo);
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    
    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado. Novo saldo: R$" + saldo);
        } else {
            System.out.println("Saque não permitido. Saldo insuficiente ou valor inválido.");
        }
    }
}
