package Heranca;

import javax.swing.*;

class GerenteEx6 extends FuncionarioEx6 {
     String departamento;


     protected GerenteEx6(String nome, double salario,  String departamento) {
         super(nome, salario);
         this.departamento = JOptionPane.showInputDialog("Informe o departamento:" + "\n"+
                 "Gerente" + "\n" +
                 "Encarregado" + "\n" +
                 "Funcionario").toUpperCase();


     }
     @Override
     protected void exibirSalario() {
         super.aumentarSalario(0);
         System.out.println("Departamento: " + departamento);
     }

     }

