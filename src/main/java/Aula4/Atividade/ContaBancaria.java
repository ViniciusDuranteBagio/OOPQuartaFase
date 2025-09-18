package Aula4.Atividade;

public class ContaBancaria {
    private String titular;
    private double saldo;

    public ContaBancaria(String titular,double saldo){
        this.titular=titular;
        this.saldo=0.0;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void exibirDetalhes() {
        System.out.println("Titular: " + this.titular);
        System.out.println("Saldo: R$ " + this.saldo);
    }


}
