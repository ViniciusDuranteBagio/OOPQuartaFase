package Prova;

public class Produto {
    private String nome;
    private double preco;

    public Produto(String nome,double preco){
        this.nome=nome;
        this.preco=preco;

    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void exibirDetalhes(){
        System.out.println("=== Informações do Produto ===");
        System.out.println("Nome: " + this.nome);
        System.out.println("Preço R$: " + this.preco);
        System.out.println("================================");
    }
}
