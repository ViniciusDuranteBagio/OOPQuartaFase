package main.java.org.example.Encapsulamento;

public class ContaBancaria {
    private int numeroConta;
    private double saldo;
    private String titular;

    public ContaBancaria(int numeroConta) {

    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }






    public String getTitular() {
        return titular;
    }



    public void depositar(double valor){
        if(valor>0){
            valor += 0;

        }
        saldo += valor;
    }
    public void sacar(double valor){
        if(saldo > valor){
            saldo -= valor;

        }else {
            System.out.println("Saldo insuficiente");
        }
    }
}
