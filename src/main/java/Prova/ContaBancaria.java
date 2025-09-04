package Prova;

public class ContaBancaria {

    private String titular;
    private Double saldo = 0.0;

    public ContaBancaria(String titular) {
        this.titular = titular;
    }

    public double depositar(double valor){
        return this.saldo += valor;
    }

    public double sacar(double valor){
        if(valor < saldo){
            this.saldo -= valor;
        }
        else{
            System.out.println("Quantia indisponível para saque");
        }
        return this.saldo;
    }

    public String getTitular() {
        return titular;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void exibirConta(){
        System.out.println("Titular: " + getTitular() + "\nSaldo: " + getSaldo());
    }

}
