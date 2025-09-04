package Prova;

public class Pessoa {
    public String nome;
    public int idade;

    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public Pessoa(){
        setNome(nome);
        setIdade(idade);
    }

    public String getNome(){
        return nome;
    }
    public int getIdade(){
        return idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void apresentar(){
        System.out.println("Olá meu nome é " + nome + " e tenho " + idade + " anos!");
    }

}
