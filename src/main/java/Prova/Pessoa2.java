package Prova;

public class Pessoa2 {
    String nome = "John Kennedy";
    int idade = 21;

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public void apresentar() {
        System.out.println("Olá meu nome é " + nome + " e tenho " + idade + " anos");
    }
}
