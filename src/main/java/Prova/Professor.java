package Prova;

import javax.swing.*;

public class Professor extends Pessoa{
    String disciplina;

    protected Professor(String nome, int idade) {
        super(nome, idade);
        this.disciplina = JOptionPane.showInputDialog("Informe a disciplina: ");

    }
    @Override
    public void apresentar(){
        System.out.println("Olá sou " + nome + ", e tenho " + idade + " anos" + " e tenho a disciplina " + disciplina);

    }
}