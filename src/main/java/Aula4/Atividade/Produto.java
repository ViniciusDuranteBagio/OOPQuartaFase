package Aula4.Atividade;

public class Produto {
    private String nome;
    private double preco;


    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void exibirDetalhes() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Preço: R$ " + this.preco);
    }
}
