package ExerciciosAula3;

public class ContaBancaria {
    private String numeroConta;
    private double saldo;
    private String titular;

    // Construtor para inicializar os dados essenciais
    public ContaBancaria(String numeroConta, String titular) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = 0.0; // Saldo inicial é sempre zero
    }

    // --- Getters ---
    public String getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    // --- Setter ---
    public void setTitular(String titular) {
        this.titular = titular;
    }

    // --- Métodos de Operação ---
    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Erro: O valor do depósito deve ser positivo.");
        }
    }

    public void sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Erro: O valor do saque deve ser positivo.");
        } else if (this.saldo >= valor) {
            this.saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Erro: Saldo insuficiente para realizar o saque.");
        }
    }

    public void exibirSaldo() {
        System.out.println("Saldo atual da conta " + this.numeroConta + ": R$" + this.saldo);
    }
}