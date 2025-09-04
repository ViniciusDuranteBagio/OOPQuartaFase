package Prova;

public class ContaBancaria {
   private String titular;
    double saldo;

    protected ContaBancaria(String titular) {
        this.titular = titular;
    }

    protected void Depositar(double valor) {
        saldo += valor;
        System.out.println("Seu saldo  de " + titular +  " é de " + saldo);


    }

    protected void Sacar(double saque) {
        if (saque > saldo) {
            System.out.println("Saldo insuficiente");
            System.out.println("Seu saldo  de " + titular +  " é de " + saldo);


        } else if (saque <= saldo) {
            saldo -= saque;
            System.out.println("Saque realizado no valor de " + saque);
            System.out.println("Seu saldo  de " + titular +  " é de " + saldo);

        }

    }
}
