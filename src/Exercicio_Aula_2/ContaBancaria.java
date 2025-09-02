package classe.Exercicio_Aula_2;

public class ContaBancaria {
    private int Numerodeconta;
    private double saldo;
    private String titular;

    public int getNumerodeconta() {
        return Numerodeconta;
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


    public void depositar (double valor){
        saldo += valor;
        System.out.println("O valor de " + valor + " foi depositado");

    }

    public void sacar (double valor){
        if(saldo >= valor){
            saldo -= valor;
            System.out.println("O valor de " + valor + " foi Retirado");
        }else {
            System.out.println("O saldo e insuficiente");
        }


    }


    public void MostrarSaldo(){
        System.out.println("///// SALDO /////");
        System.out.println("Seu saldo atual e de: " + saldo);

    }



}
