package Prova;

public class Produto {

    String nome;
    double preco;

    public Produto (String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    void exibirDetalhes() {
        System.out.println("Nome produto: " + nome + "\nPreço: R$" + preco);
    }
}
