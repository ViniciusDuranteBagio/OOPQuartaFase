package exercicios;

abstract class Produto3 {
    String nome;
    double preco;

    public abstract double calcularFrete();

    public void exibirResumo() {
        System.out.println("Produto: " + nome);
        System.out.println("Preço: R$" + preco);
        System.out.println("Frete: R$" + calcularFrete());
        System.out.println("Total: R$" + (preco + calcularFrete()));
    }
}
