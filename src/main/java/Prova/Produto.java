package Prova;

public class Produto {
        private String nome;
        private double preco;

        public Produto (String nomeProduto, double precoProduto) {
            this.nome = nomeProduto;
            this.preco = precoProduto;
        }

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

    public void exibirDados() {
        System.out.println(" Nome do produto: " + nome + "\n Preço do produto: " + preco);
    }
}
