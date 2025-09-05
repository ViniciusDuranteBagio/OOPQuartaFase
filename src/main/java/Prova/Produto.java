package Prova;

public class Produto {
    private String nome;
    private double preco;

    public Produto(String N, int A) {
        nome = N;
        preco = A;
    }
    void exibirInfo() {
        System.out.println("nome: " + nome + ", preço: " + preco);
    }
}


