package org.example.aula03;

public class Produto {
    private String nome;
    private double preco;
    private int quantidadeEmEstoque;

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
        if (preco > 0) {
            this.preco = preco;
        } else {
            System.out.println("Erro! Preco tem que ser maior que zero!");
        }
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        if (quantidadeEmEstoque >= 0) {
            this.quantidadeEmEstoque = quantidadeEmEstoque;
        } else {
            System.out.println("Erro! Quantidade precisa ser maior que zero!");
        }
    }

    public void adicionarEstoque(int quantidade) {
        if (quantidade > 0) {
            this.quantidadeEmEstoque += quantidade;
        } else {
            System.out.println("Quantidade precisa ser maior que zero!");
        }
    }

    public void vender(int quantidade) {
        if (quantidade > 0 && quantidade <= quantidadeEmEstoque) {
            this.quantidadeEmEstoque -= quantidade;
        } else {
            System.out.println("Erro! Estoque insuficiente ou quantidade invalida!");
        }
    }

    public Produto(String nome, double preco, int quantidadeEmEstoque) {
        this.setNome(nome);
        this.setPreco(preco);
        this.setQuantidadeEmEstoque(quantidadeEmEstoque);
    }

    public Produto() {
        this.setNome("Sem nome");
        this.setPreco(0.0);
        this.setQuantidadeEmEstoque(0);
    }

    public void exibirInformacoes() {
        System.out.println("Nome do produto: " + this.nome);
        System.out.println("Preco do produto: " + this.preco);
        System.out.println("Quantidade em estoque: " + this.quantidadeEmEstoque);
        System.out.println("------------------------");
    }
}