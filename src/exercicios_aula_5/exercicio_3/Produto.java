package exercicios_aula_5.exercicio_3;

abstract class Produto {
    protected String nome;
    protected double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public abstract double calcularFrete();

    public void exibirResumo() {
        System.out.println("Produto: " + nome);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Frete: R$ " + calcularFrete());
        System.out.println("Preço total: " + (preco + calcularFrete()));
        System.out.println(" ");
    }
}