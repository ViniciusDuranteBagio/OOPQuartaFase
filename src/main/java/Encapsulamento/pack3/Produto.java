package Encapsulamento.pack3;

public class Produto {
    private String nome;
    private double preco;
    private int qtdEstoque;

    public Produto() {
        this.nome = "Sem nome";
        this.preco = 0.0;
        this.qtdEstoque = 0;
    }

    public Produto(String nome, double preco, int qtdEstoque){
        this.nome = nome;
        setPreco(preco);
        setQtdEstoque(qtdEstoque);
    }

    public String getNome() {
        return nome;
    }
    public double getPreco() {
        return preco;
    }
    public int getQtdEstoque() {
        return qtdEstoque;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco){
        if(preco>0){
            this.preco = preco;
        }else{
            System.out.println("ERRO: Preço do produto deve ser maior que zero!");
        }
    }

    public void setQtdEstoque(int qtdEstoque) {
        if(qtdEstoque>=0){
            this.qtdEstoque = qtdEstoque;
        }else{
            System.out.println("ERRO: O valor do estoque não pode ser menor que zero!");
        }
    }

    public void adicionarEstoque(int quantidade) {
        if(quantidade>0){
            this.qtdEstoque += quantidade;
            System.out.println("Foram adicionadas" + quantidade + "unidades ao estoque.");
        }else {
            System.out.println("ERRO: A quantidade adicionada deve ser positiva!");
        }
    }

    public void vender(int quantidade){
        if (quantidade>0 && quantidade <= qtdEstoque) {
            this.qtdEstoque-=quantidade;
            System.out.println("Venda realizada com sucesso! Quantidade vendida: " + quantidade);
        }else {
            System.out.println("ERRO: Estoque insuficiente ou quantidade inválida.");
        }
    }

    public void exibirInfo(){
        System.out.println("Produto: " + nome);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Quantidade em estoque: " + qtdEstoque);
        System.out.println("------------------------------------");
    }
}
