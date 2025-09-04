package Prova;

public class ContaBancaria {
    String titular;
    double saldo;

    public void depositar(double valor){
        if (valor >= 0){
            saldo += valor;
        }
    }
    public void sacar(double valor){
        if (valor >= 0 && valor <= saldo){
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente " );
        }

    }
    public void mostrarSaldo(){
        System.out.println("O titular " + titular + " tem um saldo de " + saldo);
    }
}
