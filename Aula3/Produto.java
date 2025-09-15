package Aula3;

public class Produto {
    private String nome;
    private double preco;
    private int qtdEstoque;

    public Produto(String nome, double preco, int qtdEstoque){
        this.nome = nome;
        this.preco = preco;
        this.qtdEstoque = qtdEstoque;
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
        if(preco > 0){
            this.preco = preco;
        }else{
            System.out.println("Erro! Preço deve ser maior que 0.");
        }
    }
    public int getQtdEstoque() {
        return qtdEstoque;
    }

    public void setQtdEstoque(int qtdEstoque) {
        if(qtdEstoque >= 0){
            this.qtdEstoque = qtdEstoque;
        }else {
            System.out.println("Erro! Quantia em estoque não pode ser menor que 0.");
        }
    }
    public void adcEstoque(int quantidade){
        if (quantidade > 0){
            this.qtdEstoque += quantidade;
            System.out.println(quantidade + " itens adicionados ao estoque.\nTotal de " + this.nome + " em estoque: " + this.qtdEstoque);
        }else {
            System.out.println("Erro! Quantia a ser adicionada deve ser maior que 0.");
        }
    }
    public void vender(int quantidade){
        if(quantidade >= this.qtdEstoque){
            this.qtdEstoque -= quantidade;
            System.out.println(quantidade + " itens vendidos.\nTotal de " + this.nome + " em estoque: " + this.qtdEstoque);
        }else {
            System.out.println("Erro! Não há itens o suficiente em estoque.");
        }
    }
}
