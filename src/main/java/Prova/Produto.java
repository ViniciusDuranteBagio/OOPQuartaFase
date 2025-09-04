package Prova;

public class Produto {
    String nome;
    double preco;

    public Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }

    public void imprimeValores() {
        System.out.println("Nome do produto: " + nome + "\nPreço: " + preco);
    }
}
