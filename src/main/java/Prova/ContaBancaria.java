package Prova;

public class ContaBancaria {
   private String titular;
   private double saldo;

   public ContaBancaria(String titularInical, double saldoIncial) {
   if(saldoIncial<0){
       saldoIncial = 0;
   }
        this.titular= titularInical;
        this.saldo = saldoIncial;
   }
   public void depositar(double valorDeposito) {
       if (valorDeposito < 0) {
           System.out.println("Valores negativos não são validos para deposito");
       }
       else{
           saldo = saldo + valorDeposito;
       }
   }
   public void sacar(double valorSaque){
       if(valorSaque > saldo){
           System.out.println("Saldo insuficiente!");
       } else if (valorSaque<=0){
           System.out.println(" o valor de saque não pode ser negativo ou nulo");
       }
       else{
           saldo = saldo - valorSaque;
       }
   }
   public void exibirdados(){
       System.out.println("Titular: "+titular+"\nSaldo: "+saldo);
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
}
