package Aula4;

public class Produto {

    //atributos da classe
    private String nome;
    private double preco;

    //construtor da classe
    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    //metodos getter
    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    //metodo exibirDetalhes()
    public void exibirDetalhes(){
        System.out.println("Nome: " + getNome() +
                "\nPreço: " + getPreco());
    }

}
