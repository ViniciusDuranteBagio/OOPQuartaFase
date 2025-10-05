package Aula3;

public class ContaBancaria {
    private String numeroConta;
    private double saldo;
    private String titular;
    
    // Construtor
    public ContaBancaria(String numeroConta, String titular) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = 0.0;
    }
    
    // Getters e Setters
    public String getNumeroConta() {
        return numeroConta;
    }
    
    public double getSaldo() {
        return saldo;
    }
    
    public String getTitular() {
        return titular;
    }
    
    public void setTitular(String titular) {
        this.titular = titular;
    }
    
    // Métodos para operações bancárias
    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado com sucesso!");
        } else {
            System.out.println("Erro: Valor para depósito deve ser maior que zero.");
        }
    }
    
    public void sacar(double valor) {
        if (valor > 0) {
            if (this.saldo >= valor) {
                this.saldo -= valor;
                System.out.println("Saque de R$ " + valor + " realizado com sucesso!");
            } else {
                System.out.println("Erro: Saldo insuficiente para realizar o saque.");
            }
        } else {
            System.out.println("Erro: Valor para saque deve ser maior que zero.");
        }
    }
    
    public void exibirSaldo() {
        System.out.println("Saldo atual da conta: R$ " + this.saldo);
    }
} 