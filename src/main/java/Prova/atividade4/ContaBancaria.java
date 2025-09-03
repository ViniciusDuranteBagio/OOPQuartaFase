package atividade4;

public class ContaBancaria {
    String titular;
    double saldo;


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
