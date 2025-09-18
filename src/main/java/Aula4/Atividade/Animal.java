package Aula4.Atividade;

public class Animal {
    protected String nome;
    protected int idade;

    public Animal(String nome,int idade){
        this.nome=nome;
        this.idade=idade;

    }

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void dormir() {
        System.out.println("O animal está dormindo");
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
    }
}
