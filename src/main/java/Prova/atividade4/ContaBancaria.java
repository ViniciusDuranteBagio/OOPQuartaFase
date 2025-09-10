package atividade4;

public class ContaBancaria {
    private String titular;
    private double saldo;

    public void setTitular(String titular) {
        this.titular = titular;
    }
    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor){
        saldo += valor;
        System.out.println("seu novo saldo é de " + saldo);
    }

    public void sacar(double valor){
        if (valor > saldo){
            System.out.println("erro");
        }else {
            saldo -= valor;
            System.out.println("novo saldo é de " + saldo);
        }
    }
}
