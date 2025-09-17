package Prova;

import javax.swing.*;

public class Professor extends Pessoa{
    private String disciplina;

    public Professor(String nome, int idade, String disciplina) {
        super(nome, idade);
        this.disciplina=disciplina;
    }

    @Override
    public void apresentar() {
        super.apresentar();
        JOptionPane.showMessageDialog(null,"Olá! meu nome é "+nome+", e tenho "+
                idade+" anos! \n Sou professor de "+disciplina);
    }
}
