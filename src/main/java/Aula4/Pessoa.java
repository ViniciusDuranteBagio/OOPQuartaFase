package Aula4;

public class Pessoa {

    //atributos da classe pessoa
    private String nome;
    private int idade;

    //construtor do exercicio2
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    //métodos getter e setter pois os atributos são privados
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
