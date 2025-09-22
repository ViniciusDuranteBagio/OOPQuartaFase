public class Produto {
    private String nome;
    private double preco;
    private int quantidadeEmEstoque;

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
        if (preco > 0) {
            this.preco = preco;
        } else {
            System.out.println("Erro: preço deve ser maior que zero.");
        }
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void setQuantidadeEmEstoque(int quantidade) {
        if (quantidade >= 0) {
            this.quantidadeEmEstoque = quantidade;
        } else {
            System.out.println("Erro: quantidade deve ser maior ou igual a zero.");
        }
    }

    public void adicionarEstoque(int quantidade) {
        if (quantidade > 0) {
            this.quantidadeEmEstoque += quantidade;
        }
    }

    public void vender(int quantidade) {
        if (quantidade > 0 && this.quantidadeEmEstoque >= quantidade) {
            this.quantidadeEmEstoque -= quantidade;
        } else {
            System.out.println("Erro: estoque insuficiente ou quantidade inválida.");
        }
    }
}
