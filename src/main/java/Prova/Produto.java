package Prova;

public class Produto {

    private String nome;
    private Double preço;

    public Produto(String nome, Double preço) {
        this.nome = nome;
        this.preço = preço;
    }

    public Double getPreço() {
        return preço;
    }

    public String getNome() {
        return nome;
    }

    public void exibirProduto(){
        System.out.println("Produto: " + getNome() + "\n  Preço: " + getPreço());
    }
}
