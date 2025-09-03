package Prova;

import javax.swing.*;

public class Pessoa {

    private String nome;
    private int idade;

    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void exibirInfo() {
        JOptionPane.showMessageDialog(null,"nome: " + nome );
        JOptionPane.showMessageDialog(null,"idade: " + idade );
    }
}
