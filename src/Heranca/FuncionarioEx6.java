package Heranca;

import javax.swing.*;

abstract class FuncionarioEx6 {
     protected String nome;
     protected double salario;
     protected FuncionarioEx6(String nome, double salario){
         this.nome = JOptionPane.showInputDialog("Informe seu nome: ");
         this.salario = Double.parseDouble(JOptionPane.showInputDialog("Informe seu salario: "));
     }
     protected void aumentarSalario(double porcentagem){

         salario = salario + (salario * (porcentagem/100));
         System.out.println("O " + nome + " recebe R$ " + salario);

     }

    protected abstract void exibirSalario();
}

