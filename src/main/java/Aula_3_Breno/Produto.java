package Aula_3_Breno;

public class Produto {

    private String nome;
    private double preco;
    private int quantidadeEmEstoque;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setPreco(double preco) {
        if (preco > 0) {
            this.preco = preco;
        } else {
            System.out.println("Preço invalido");
        }
    }

    public double getPreco() {
        return preco;
    }

    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        if (quantidadeEmEstoque > 0) {
            this.quantidadeEmEstoque = quantidadeEmEstoque;
        } else if (quantidadeEmEstoque == 0) {
            System.out.println("Sem este item no estoque");
        } else {
            System.out.println("Quantidade invalida");
        }
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void adicionarEstoque(int quantidade){
        if (quantidade >= 0) {
            this.quantidadeEmEstoque += quantidade;
        } else {
            System.out.println("Quantidade invalida");
        }
    }

    public void vender(int quantidade) {
        if (quantidade <= quantidadeEmEstoque) {
            quantidadeEmEstoque -= quantidade;
        } else {
            System.out.println("Quantidade insuficiente no estoque, a venda não foi efetuada");
        }
    }

    public void mostrarEstoque() {
        if (quantidadeEmEstoque >= 0) {
            System.out.println("Nome: " + nome);
            System.out.println("Preço: " + preco);
            System.out.println("Quantidade em estoque: " + quantidadeEmEstoque);
        } else {
            System.out.println("Sem este item no estoque");
        }
    }
}