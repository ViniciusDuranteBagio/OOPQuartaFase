package ExerciciosAula3;

public class Produto {
    private String nome;
    private double preco;
    private int quantidadeEmEstoque;

    // --- Getters ---
    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    // --- Setters com Validação ---
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        if (preco > 0) {
            this.preco = preco;
        } else {
            System.out.println("Erro: O preço deve ser maior que zero.");
        }
    }

    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        if (quantidadeEmEstoque >= 0) {
            this.quantidadeEmEstoque = quantidadeEmEstoque;
        } else {
            System.out.println("Erro: A quantidade em estoque não pode ser negativa.");
        }
    }

    // --- Métodos de Operação ---
    public void adicionarEstoque(int quantidade) {
        if (quantidade > 0) {
            this.quantidadeEmEstoque += quantidade;
            System.out.println(quantidade + " unidades adicionadas ao estoque.");
        } else {
            System.out.println("Erro: A quantidade a ser adicionada deve ser positiva.");
        }
    }

    public void vender(int quantidade) {
        if (quantidade <= 0) {
            System.out.println("Erro: A quantidade a ser vendida deve ser positiva.");
        } else if (this.quantidadeEmEstoque >= quantidade) {
            this.quantidadeEmEstoque -= quantidade;
            System.out.println("Venda de " + quantidade + " unidades realizada.");
        } else {
            System.out.println("Erro: Estoque insuficiente para realizar a venda.");
        }
    }
}