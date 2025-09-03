package Prova;

public class Produto {
    String nome;
    double preco;

    public void exibirProduto() {
        System.out.println("Produto: " + nome);
        System.out.println("Preço: R$ " + preco);
    }
}
