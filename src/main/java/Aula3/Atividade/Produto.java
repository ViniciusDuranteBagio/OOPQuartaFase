package Aula3.Atividade;

public class Produto {
    private String nome;
    private double preco;
    private int quantidadeEstoque;

    public Produto(String nome,Double preco, int quantidadeEstoque){
        this.preco=preco;
        this.nome=nome;
        this.quantidadeEstoque=quantidadeEstoque;
    }

    public double getPreco() {
        return preco;
    }
    public String getNome(){
        return nome;
    }
    public int getQuantidadeEstoque(){
        return quantidadeEstoque;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        if(preco<=0){
            System.out.println("Valor inválido");
        }else{
            this.preco=preco;
        }
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        if (quantidadeEstoque <= 0){
            System.out.println("Valor inválido,quantidade mínima: 1");
        }else{
            this.quantidadeEstoque = quantidadeEstoque;
        }
    }
    public void adicionarEstoque(int quantidade){
        if (quantidade <= 0){
            System.out.println("Qunatidade inválida");
        }else{
            quantidadeEstoque += quantidade;
        }
    }
    public void vender(int quantidade){
        if (quantidade <= quantidadeEstoque){
            quantidadeEstoque -= quantidade;
            System.out.println( "Venda realizada com sucesso! \nEstoque disponível: " + quantidadeEstoque);
        }else{
            System.out.println("Quantidade insuficiente: "+ quantidadeEstoque);
        }
    }
    public void status(){
        System.out.println("Nome do produto: "+nome + "\nPreço R$: "+ preco + "\nQuantidade em estoque: " + quantidadeEstoque);
    }


}
