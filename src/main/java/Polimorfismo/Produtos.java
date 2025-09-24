package Polimorfismo;

public abstract class Produtos {
    String nome;
    double preco;

    public Produtos(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }
    public abstract double calcularFrete();

    public void exibirResumo(){
        System.out.println("Produto:" + nome);
        System.out.println(  nome + " custa " + preco + "R$");
        System.out.println("O frete custa " + calcularFrete() + "R$");
    }
}
