package Prova;

public class ContaBancaria {
    String titular;
    double saldo;


    public void depositar(double valor){
        if (valor>=0){
            saldo+=valor;
            System.out.println("O deposito foi realizado");
        }else {
            System.out.println("Digite maior que 0");
        }
    }

    public void sacar(double valor){
        if (saldo>0){
            saldo-=valor;
            System.out.println("O valor de " + valor + " foi sacado seu saldo e de " + saldo);
        }else {
            System.out.println("Saldo menor ou igual  a 0");
        }




    }
}
