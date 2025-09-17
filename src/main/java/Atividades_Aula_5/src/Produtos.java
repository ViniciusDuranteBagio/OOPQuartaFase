package Atividades_Aula_5.src;

import javax.swing.*;

public abstract class Produtos {

    public String nome;
    public double preco;
    public double valorFrete;

    public void Produtos(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }

    abstract double calcularFrete(double Frete);

    public void exibirResumo() {
        JOptionPane.showMessageDialog(null,  "--- Resumo de produtos ---" + "\nNome do Produto: " + nome +
                "\nPreço: " + preco + "\nValor do frete: " + valorFrete);
    }
}