package Prova;

public class Pessoa {

    private String nome;
    private int    idade1;


    public Pessoa(String nome,int idade1) {
        this.idade1 = idade1;
        this.nome = nome;
    }

    public void ExibirDetalhes(){

    System.out.println("Olá, meu nome é " + nome + "e tenho " + idade1 + "anos" );
    }
    public String getNome() {
        return nome;
    }

    public int getIdade1() {
        return idade1;
    }
}
