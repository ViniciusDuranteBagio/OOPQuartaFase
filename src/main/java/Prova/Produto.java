package Prova;

public class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }

    public void informacoes(){
        System.out.println("Produto: " + nome + "\nPreço: R$" + preco);
    }
}
