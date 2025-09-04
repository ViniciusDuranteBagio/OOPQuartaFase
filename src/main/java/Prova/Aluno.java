package Prova;

import javax.swing.*;

public class Aluno extends Pessoa1 {
    int matricula;

    protected Aluno(String nome, int idade) {
        super(nome, idade);
        this.matricula = Integer.parseInt(JOptionPane.showInputDialog("Digite seu matricula"));
    }

    @Override

    protected void apresentar() {


        System.out.println("Olá sou " + nome + ", e tenho " + idade + " anos" + " e minha matrícula é " + matricula);

    }
}
