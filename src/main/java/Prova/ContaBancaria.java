package Prova;

public class ContaBancaria {
    private String titular;
    private double saldo;

    public ContaBancaria (String titular) {
        this.titular = titular;
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

    void depositar(double valorDeposito) {
        if (valorDeposito > 0){
            saldo+=valorDeposito;
            System.out.println("Feito deposito no valor de: R$" + valorDeposito);
        }
        else {
            System.out.println("ERRO!VALOR DO DEPOSITO PRECISA SER MAIOR QUE ZERO!");
        }
    }

    void sacar(double valorSaque) {
        if (valorSaque <= saldo) {
            saldo-=valorSaque;
        } else {
            System.out.println("ERRO!SALDO INSUFICIENTE PARA O VALOR DESEJADO!");
        }
    }

    void exibirSaldo(){
    System.out.println("Seu saldo atual é de: R$" + saldo);
   }



}
