package Prova;

public class Produto {
    //Questão03
    private String nome;
    private double preco;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void exibirDados() {
        System.out.println("Produto: " + nome);
        System.out.println("Preço: R$ " + preco);
    }
}