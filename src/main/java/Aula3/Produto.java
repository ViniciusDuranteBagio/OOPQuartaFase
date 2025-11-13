package Aula3;

public class Produto {
    private String nome;
    private double preco;
    private int quantidadeEmEstoque;

    public Produto(String nome, double preco, int quantidadeEmEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
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
        if (preco > 0) {
            this.preco = preco;
        } else {
            System.out.println("Erro: O preço deve ser maior que zero.");
        }
    }
    
    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }
    
    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        if (quantidadeEmEstoque >= 0) {
            this.quantidadeEmEstoque = quantidadeEmEstoque;
        } else {
            System.out.println("Erro: A quantidade em estoque deve ser maior ou igual a zero.");
        }
    }

    public void adicionarEstoque(int quantidade) {
        if (quantidade > 0) {
            this.quantidadeEmEstoque += quantidade;
            System.out.println("Adicionados " + quantidade + " itens ao estoque.");
        } else {
            System.out.println("Erro: Quantidade para adicionar deve ser maior que zero.");
        }
    }
    
    public void vender(int quantidade) {
        if (quantidade > 0) {
            if (this.quantidadeEmEstoque >= quantidade) {
                this.quantidadeEmEstoque -= quantidade;
                System.out.println("Vendidos " + quantidade + " itens. Valor total: R$ " + (quantidade * this.preco));
            } else {
                System.out.println("Erro: Estoque insuficiente. Disponível: " + this.quantidadeEmEstoque);
            }
        } else {
            System.out.println("Erro: Quantidade para venda deve ser maior que zero.");
        }
    }

    public void exibirInformacoes() {
        System.out.println("---- Informações do Produto ----");
        System.out.println("Nome: " + this.nome);
        System.out.println("Preço: R$ " + this.preco);
        System.out.println("Quantidade em estoque: " + this.quantidadeEmEstoque);
    }
} 