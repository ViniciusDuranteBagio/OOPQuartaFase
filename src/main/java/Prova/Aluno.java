package Prova;

import javax.swing.*;

public class Aluno  extends Pessoa{
    private int matricula;

    public Aluno(String nome, int idade, int matricula) {
        super(nome, idade);
        this.matricula=matricula;
    }
    public void apresentar(){

        System.out.println("Olá! meu nome é "+nome+", e tenho "+idade+" anos, " +
                        "e minha matricula é "+matricula);
    }
}
