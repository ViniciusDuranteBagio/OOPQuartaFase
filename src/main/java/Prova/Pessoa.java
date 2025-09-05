package Prova;

public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nomeInical, int idadeIncial) {
       this.nome = nomeInical;
       this.idade = idadeIncial;
    }

    public void apresentar(){
        System.out.println("Olá, meu nome é "+nome +" e tenho "+idade+" anos");
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
