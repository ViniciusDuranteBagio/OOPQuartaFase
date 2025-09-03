package Heranca;

import javax.swing.*;

class ContaBancaria {
     String titular;
     double saldo;

     protected ContaBancaria(String titular, double saldo) {
         this.titular = JOptionPane.showInputDialog("Digite o nome do titular: ");
         this.saldo = Integer.parseInt(JOptionPane.showInputDialog("Digite o saldo da conta: "));
     }
     protected void exibirConta(){
         System.out.println("Titular: " + titular + "\n" +  "Saldo: " + saldo);


     }
}
