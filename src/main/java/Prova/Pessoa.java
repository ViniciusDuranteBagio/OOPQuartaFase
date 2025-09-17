package Prova;

import javax.swing.*;

public class Pessoa {
    String nome;
    int idade;

    public Pessoa(String nome,int idade){
        this.nome=  nome;
        this.idade=idade;
    }
    public void apresentar(){

        JOptionPane.showMessageDialog(null,"Olá! meu nome é "+nome+", e tenho "+
                idade+" anos!");
    }
}
