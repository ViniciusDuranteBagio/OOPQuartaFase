package ExerciciosAula5;

public abstract class Produto {
    protected String nome;
    protected double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public void exibirResumo() {
        System.out.println("Produto: " + this.nome);
        System.out.println("Preço: R$" + this.preco);
        System.out.printf("Frete: R$%.2f\n", this.calcularFrete());
    }

    public abstract double calcularFrete();
}