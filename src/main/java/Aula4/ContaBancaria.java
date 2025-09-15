package Aula4;

public class ContaBancaria {

    //atributos da classe
    private String titular;
    private double saldo;

    //construtor da classe
    public ContaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    //metodos getter da classe
    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void exibirSaldo(){
        System.out.println("Titular: " + getTitular() +
                "\nSaldo: " + getSaldo());
    }

}
