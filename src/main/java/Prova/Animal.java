package Prova;

import javax.swing.*;

public class Animal {

    private int idade;
    private String nome;

    public String getNome(String nome) {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade(int idade) {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void fazerSom() {

        JOptionPane.showMessageDialog(null, "O animal: " + nome  + " Que tem: " +  idade + " anos " +  " FEZ SOM!! ");
    }

    public void som() {
        System.out.println(nome + " fez algum som.");
    }
}
