package Aula05;

public abstract class Ecommerce {
    protected String nome;
    protected double preco;

    public Ecommerce(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public abstract String calcularFrete();

    public void exibirResumo() {
        System.out.println("Nome: " + nome);
        System.out.println("Preco: " + preco);
        System.out.println("Frete: " + calcularFrete());
        System.out.println("--------------------");
    }

}
