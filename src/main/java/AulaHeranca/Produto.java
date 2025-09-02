package AulaHeranca;

public class Produto {

    String nome;
    double preco;

    public Produto (String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }
    public void exibirDetalhes() {
        System.out.println(nome + "\n" + preco);
    }
}
