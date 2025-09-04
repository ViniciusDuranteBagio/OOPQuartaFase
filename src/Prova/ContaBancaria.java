package Prova;

public class ContaBancaria {
    private String titular;
    private double saldo;

    // Construtor
    public ContaBancaria(String titular){
        this.titular = titular;
    }

    public void depositar(double valor){
        if (valor < 0){
            System.out.println(titular + ", o valor não pode ser negativo!");
        } else {
            saldo = saldo + valor;
            System.out.println(titular + " seu saldo atual é R$ " + saldo);
        }
    }

    public void sacar(double valor){
        if (valor < 0){
            System.out.println(titular + ", o valor não pode ser negativo!");
        } else if ((saldo - valor) < 0){
            System.out.println(titular + ", o saldo não pode ficar negativo!");
        } else {
            saldo = saldo - valor;
            System.out.println(titular + " seu saldo atual é R$ " + saldo);
        }
    }
}