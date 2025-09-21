package Atividades.Aula5;

import javax.swing.*;

public abstract class Produtos {
    protected  String nome;
    protected double preco;

    public Produtos(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }

    public abstract double calcularFrete();

    public void exibirResumo() {
        JOptionPane.showMessageDialog(null, "Nome: " + nome +
                "\nPreço: R$ " + preco + "\nFrete: R$ " + calcularFrete());
    }
}
