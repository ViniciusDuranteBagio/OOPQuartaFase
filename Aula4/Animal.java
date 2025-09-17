package Aula4;

public class Animal {
    protected String nome;
    protected int idade;

    public Animal(){
    }

    public Animal(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
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

    public void dormir(){
        System.out.println("O animal está dormindo.");
    }
    public void exibirInformacoes(){
        System.out.println("        Informações        \nNome: " + this.nome + "\nIdade: " + this.idade + " anos");
    }
}
