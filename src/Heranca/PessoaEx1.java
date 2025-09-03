package Heranca;

import javax.swing.*;

class PessoaEx1 {
    String nome;
    int idade;

    protected PessoaEx1(String nome, int idade) {
        this.nome = JOptionPane.showInputDialog("Informe seu nome");
        this.idade = Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade"));
    }
    protected void exibirInfo() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
    }

}
