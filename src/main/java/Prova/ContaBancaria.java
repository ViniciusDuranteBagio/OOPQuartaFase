package Prova;

public class ContaBancaria {
    private String titular;
    private double saldo;

    public ContaBancaria(String titular) {
        this.titular = titular;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        } else {
            System.out.println("Quantia inválida");
        }
    }

    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
        } else if (valor < 0) {
            System.out.println("Valor Inválido");
        } else {
            System.out.println("Saldo Insuficiente");
        }
    }
    public void exibirSaldo(){
        System.out.println("Titular: "+titular);
        System.out.println("Saldo: R$"+saldo);
    }
}

