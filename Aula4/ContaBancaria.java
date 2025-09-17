package Aula4;

public class ContaBancaria {
    protected String titular;
    protected double saldo;

    public ContaBancaria(){
    }
    public ContaBancaria(String titular, double saldo){
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void exibirDetalhes(){
        System.out.println("        DETALHES DA CONTA        \nTitular: " + this.titular + "\nSaldo: R$" + this.saldo);
    }
}
