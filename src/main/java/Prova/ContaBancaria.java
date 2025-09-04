package Prova ;

public class ContaBancaria {

    //Crie uma classe ContaBancaria com os atributos titular e saldo. 
    //Adicione métodos depositar(double valor) e sacar(double valor) que atualizam o saldo.
    //O saldo nunca pode ficar negativo.

    String titularDaConta;
    double saldo;

    public ContaBancaria(String titular, double saldoInicial) {
        this.titularDaConta = titular;
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado. Saldo atual: R$ " + saldo);
        } else {
            System.out.println("Valor inválido para depósito.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0) {
            if (saldo >= valor) {
                saldo -= valor;
                System.out.println("Saque de R$ " + valor + " realizado, bicho rico. Saldo atual: R$ " + saldo);
            } else {
                System.out.println("Money que é gudi, nóis nao havi. Sem dinheiro, sem saque.");
            }
        } else {
            System.out.println("Valor inválido para saque. Não sabe como funciona?");
        }
    }
}
