package main.java.org.example.Encapsulamento;

import javax.swing.*;

public class Produto {
    private String nome;
    private double preco;
    private int quantidadeEstoque;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco1) {
        preco1 = Integer.parseInt(JOptionPane.showInputDialog("Adicione o preço "));
        if (preco1 > 0) {
            this.preco = preco1;
        }else {
            JOptionPane.showMessageDialog(null,"Erro, preço inválido");
        }

    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int qtdEstoque) {
        if (quantidadeEstoque >= 0) {
        this.quantidadeEstoque = qtdEstoque;
    }else {
            JOptionPane.showMessageDialog(null,"Erro, quantidade inválida");
        }
    }
    public void adicionarEstoque(int  quantidade){
        quantidade = Integer.parseInt(JOptionPane.showInputDialog("Adicione a quantidade de estoque"));
        this.quantidadeEstoque += quantidade;

    }
    public void vender (int qtdVendas){
        qtdVendas = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de vendas"));
        if(quantidadeEstoque >= qtdVendas){
        this.quantidadeEstoque -= qtdVendas;
    }else {
            JOptionPane.showMessageDialog(null,"Estoque insuficiente");
        }
    }


    public void exibir (){
        JOptionPane.showMessageDialog(null,"Estoque: " + quantidadeEstoque);
    }
}
