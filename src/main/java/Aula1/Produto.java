public class Produto {

    private String nome;
    private double preco;
    private int qtdEstoque;

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
            System.out.println("Erro. Preço deve ser maior que zero");
        }
    }

    public int getQtdEstoque() {
        return qtdEstoque;
    }

    public void setQtdEstoque(int qtdEstoque) {
        if (qtdEstoque > 0) {
            this.qtdEstoque = qtdEstoque;
        } else {
            System.out.println("Erro. Quantidade em estoque menor que zero. Tente novamente.");

        }
    }
        public void adicionarEstoque (int quantidade) {
            if (quantidade >= 0) {
                qtdEstoque += quantidade;
            } else {
                System.out.println("Erro. A quantidade deve ser maior que 0.");
        }
    }
    public void vender (int quantidade) {
        if (quantidade > 0 && qtdEstoque >= quantidade) {
            qtdEstoque -= quantidade;
        } else {
            System.out.println("Venda não realizada. Verificar estoque.");
        }
    }
        public void exibirProduto() {
            System.out.println("Produto: " + nome + "\n" + "Quantidade em estoque: " + qtdEstoque + "\n" + "Preço: " + preco);
        }

}
