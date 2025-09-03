package Prova;

public class Produto {
    private String nome;
    private double preco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void imprimirValores() {
        System.out.println("Nome: " + nome);
        System.out.println("Preco: " + preco);
    }
}
