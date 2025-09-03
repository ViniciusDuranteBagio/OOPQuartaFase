package Heranca;

import javax.swing.*;

class AlunoEx1 extends PessoaEx1 {
     int matricula;
     protected AlunoEx1(String nome, int idade,  int matricula) {
         super(nome, idade);

         this.matricula = Integer.parseInt(JOptionPane.showInputDialog("Informe seu matricula"));
     }
     @Override
     public void exibirInfo() {
         super.exibirInfo();
         System.out.println("Matricula: " + this.matricula);
     }




}
