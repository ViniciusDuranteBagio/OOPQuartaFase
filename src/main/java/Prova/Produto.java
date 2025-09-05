package Prova;

public class Produto {

    private String nome2;
    private String nome1 ;
    private int preco;
    private int preco2;

    public Produto(String nome1,String nome2,int preco,int preco2){
        this.nome2 = nome2;
        this.nome1 = nome1 ;
        this.preco = preco;
        this.preco2 = preco2;
    }

    public void ExibirDetalhes1(){

        System.out.println("O Produto " + nome1 + " é " + preco + "$" + "\n" + "O Produto " + nome2 + " é " + preco2 + "$");



    }



}
