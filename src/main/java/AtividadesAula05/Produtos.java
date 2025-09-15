package AtividadesAula05;

public abstract class Produtos {
    String nome;
    double preco;

    public Produtos (String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public abstract void calcularFrete();

    public void exibirResumo() {
        System.out.println("Produto: " + nome + "\nPreço: R$" +  preco);
    }
}
