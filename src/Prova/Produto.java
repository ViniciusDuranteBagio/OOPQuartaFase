package Prova;

public class Produto {
    private String nome;
    private double preco;

    // Construtor
    public Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }

    public void ExibirInformacoes(){
        System.out.println("O produto " + nome + " custa R$ " + preco);
    }

}