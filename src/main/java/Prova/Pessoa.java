package Prova;

public class Pessoa {

    public String nome;
    public int idade;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    void apresentar() {
        System.out.println("“Olá, meu nome é " + nome + " e tenho " + idade + " anos");
    }

}
