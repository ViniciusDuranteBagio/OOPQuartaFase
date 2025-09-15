package Aula3;

public class ContaBancaria {
    private String numeroConta;
    private double saldo;
    private String titular;

    public ContaBancaria(String numeroConta, String titular){
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = 0.0;
    }

    public String getNumeroConta(){
        return numeroConta;
    }

    public double getSaldo(){
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void depositar(double valor){
        if(valor > 0){
            this.saldo += valor;
            System.out.println("Depósito de R$" + valor + " depositado com sucesso!");
        }else {
            System.out.println("Valor inválido!");
        }
    }

    public void sacar(double valor){
        if(valor > 0){
            if(this.saldo >= valor){
                this.saldo -= valor;
                System.out.println("Saque de R$ " + valor + " realizado com sucesso!");
            }else {
                System.out.println("Saldo insuficiênte para realizar o saque!");
            }
        }else {
            System.out.println("Erro. Valor deve ser maior que zero!");
        }
    }

    public void exibirSaldo(){
        System.out.println("Saldo atual da conta é de R$" + this.saldo);
    }
}
