package Aula5.Exercicios;

public abstract class Produto {
    protected String nome;
    protected double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public abstract double calcularFrete();

    public void exibirResumo() {
        System.out.println("Produto: " + nome + " | Preço: R$" + preco + " | Frete: R$" + calcularFrete());
    }
}