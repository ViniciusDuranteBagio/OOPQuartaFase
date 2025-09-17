package Atividades_Aula_5;


abstract class Loja {
    protected String nome;
    protected double preco;

    public Loja(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }


    public abstract double calcularFrete();


    public void exibirResumo() {
        System.out.println("Produto: " + nome);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Frete: R$ " + calcularFrete());
    }
}