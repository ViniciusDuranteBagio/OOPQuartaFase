package ExercsEncapsulamento;

public class Produto {

    private String nome;
    private double preco;
    private int quantidadeEmEstoque;

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        if (preco >= 0) {
            this.preco = preco;
        } else {
            System.out.println("ERRO!Preço não pode ser negativo!");
        }
    }

    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        if (quantidadeEmEstoque >=0) {
            this.quantidadeEmEstoque = quantidadeEmEstoque;
        } else {
            System.out.println("ERRO!Quantidade não pode ser negativa!");
        }
    }

    void adicionarEstoque(int quantidade){
        quantidadeEmEstoque+=quantidade;
        System.out.println("Adicionado "+ quantidade + " " + nome + " no estoque");
    }

    void vender(int quantidadevendida) {
        if (quantidadeEmEstoque >=1){
            quantidadeEmEstoque-=quantidadevendida;
            preco = quantidadevendida * preco;
            System.out.println("Feito venda de " + quantidadevendida + " " + nome + " por R$" + preco);
        }else {
            System.out.println("Quantidade em estoque insuficiente!");
        }
    }

    void exibirEstoque (){
        System.out.println("Quantidade em estoque de " + nome + " " + quantidadeEmEstoque);
    }

}
