package Atividades.Aula4;

import javax.swing.*;

public class Animal {
    protected String nome;

    Animal(String nome, int idade) {
        this.nome = nome;

    }

    protected void dormir() {
        JOptionPane.showMessageDialog(null, "O animal está dormindo");
    }

    protected void exibirInformacoes() {
        JOptionPane.showMessageDialog(null, nome);
    }

}
