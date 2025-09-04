package Prova;

public class Produto {
    String nome;
    double preco;

    public Produto(String nome, double preco){
        this.nome=nome;
        this.preco=preco;
    }
    public void exibirInformacoes(){
        System.out.println("Nome do produto: "+nome);
        System.out.println("Preço do produto: R$ "+preco);
    }
}
