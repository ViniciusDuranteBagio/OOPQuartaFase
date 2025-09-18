package Aula3.Exercicios;

public class ContaBancaria {
    public int NConta;
    public double VlSaldo;
    public String Titular;


    // Construtor
    public ContaBancaria(String numeroConta, String titular, double saldoInicial) {
        this.NConta = Integer.parseInt(numeroConta);
        this.Titular = titular;
        if (saldoInicial >= 0) {
            this.VlSaldo = saldoInicial;
        } else {
            this.VlSaldo = 0; // garante que não inicie negativo
        }
    }

    // Getters
    public int getNumeroConta() {
        return NConta;
    }

    public double getSaldo() {
        return VlSaldo;
    }

    public String getTitular() {
        return Titular;
    }

    // Setter apenas para titular (não pode para saldo e numeroConta)
    public void setTitular(String titular) {
        this.Titular = titular;
    }

    // Métodos de operação
    public void depositar(double valor) {
        if (valor > 0) {
            VlSaldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor inválido para depósito.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= VlSaldo) {
            VlSaldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saque não permitido. Saldo insuficiente ou valor inválido.");
        }
    }

    public void exibirSaldo() {
        System.out.println("Saldo atual da conta " + NConta + ": R$ " + VlSaldo);
}
}
