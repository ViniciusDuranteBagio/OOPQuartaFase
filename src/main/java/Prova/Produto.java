package Prova;

public class Produto {
    private String nome;
    private double preco;

    public Produto (String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public void mostrarProduto(){
        System.out.println("Produto: " + getNome() + "\nPreço: " + getPreco());
    }
}
