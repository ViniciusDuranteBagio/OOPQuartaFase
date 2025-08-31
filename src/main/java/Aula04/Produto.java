package Aula04;

public class Produto {
    protected String nome;
    protected double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;

    }

    public void exibirDetalhes() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Preco: " + this.preco);
    }
}
