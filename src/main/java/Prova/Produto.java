package Prova;

public class Produto {
    String nome;
    double preco;

    protected Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;

    }

    protected void ExibirDados() {
        System.out.println("O produto " + nome + " está com o valor " + preco);
    }


}
