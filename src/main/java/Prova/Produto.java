package Prova;

import javax.swing.*;

public class Produto {

    private String nome;
    private double preco;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void ecxibirProduto() {
        JOptionPane.showMessageDialog(null, "Produtos e Valores: ");
        JOptionPane.showMessageDialog(null, "item: " + nome);
        JOptionPane.showMessageDialog(null, "preco: " + preco);
    }
}
