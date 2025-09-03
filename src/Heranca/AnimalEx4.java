package Heranca;

import javax.swing.*;

class AnimalEx4 {
     protected String nome;
    protected int idade;

     protected AnimalEx4(String nome, int idade){
         this.nome = JOptionPane.showInputDialog("Informe o nome do cachorro");
         this.idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade do cachorro"));


     }

     protected void exibir(){
         System.out.println("O " + nome + " tem " + idade + " anos");
     }

     protected void dormir(){
         System.out.println("O animal está dormindo");
     }
}
