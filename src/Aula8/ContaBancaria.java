package Aula8;

public class ContaBancaria {
   private double saldo;
   private double deposito;

   public ContaBancaria(double saldo) {
       this.saldo = saldo;
   }

   public double depositar(double deposito) {
       if (deposito < 0) {
           return saldo;
       } else {
           saldo += deposito;
           return saldo;
       }
   }
}
