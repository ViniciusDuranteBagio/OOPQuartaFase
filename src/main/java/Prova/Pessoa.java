package Prova;

public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome,int idade){
        this.nome=nome;
        this.idade=idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void apresentar(){
        System.out.println("Olá, meu nome é " + this.nome + " e tenho "+ this.idade+" anos");

    }

    protected void exibirInformacoes() {
        System.out.println("Olá, meu nome é " + this.nome + " e tenho "+ this.idade+" anos");

    }
}
