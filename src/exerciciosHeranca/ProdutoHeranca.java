public class ProdutoHeranca {
    String nome;
    double preco;

    public ProdutoHeranca(String nome, double preco){
        this.nome=nome;
        this.preco=preco;
    }
    public void exibirDetalhes(){
        System.out.println("Nome do produto: "+nome);
        System.out.println("Preço do produto: "+preco);
    }
}
