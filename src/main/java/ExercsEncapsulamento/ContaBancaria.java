package ExercsEncapsulamento;

public class ContaBancaria {
    private int numeroConta;
    private double saldo;
    private String titular;


    public ContaBancaria(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        if (titular != null && titular.length() > 1){
            this.titular = titular;
            System.out.println("Titular: " + titular);
        } else {
            System.out.println("ERRO!O NOME DO TITULAR PRECISA TER MAIS DE 1 CARACTERE!");
        }
    }

    void depositar(double valorDepositado) {
        if (valorDepositado > 0) {
            saldo += valorDepositado;
            System.out.println("Feito depósito no valor de: R$" + valorDepositado);
        } else {
            System.out.println("VALOR DO DEPÓSITO PRECISA SER MAIOR QUE ZERO!");
        }
    }

    void sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente para o valor desejado!");
        }
    }

    void exibirSaldo() {
        System.out.println("O seu saldo é de: R$" + saldo);
    }


}

