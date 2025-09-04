package Prova;

public class Pessoa3 {
    private String nome;
    private int idade;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }
    public void apresentar() {
        System.out.println("Olá, sou " + nome + " e tenho " + idade + " anos.");
    }
}
