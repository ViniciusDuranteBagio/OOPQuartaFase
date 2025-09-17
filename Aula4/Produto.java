package Aula4;

public class Produto {
    protected String nome;
    protected double preco;

    public Produto(){
    }
    public Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }

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

    public void exibirDetalhes(){
        System.out.println("         DETALHES DO PRODUTO         \nNome: " + this.nome + "\nPreço: R$" + this.preco);
    }
}
