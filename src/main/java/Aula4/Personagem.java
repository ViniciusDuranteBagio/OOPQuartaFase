package Aula4;

public class Personagem {
    private String nome;
    private int idade;

    public Personagem(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void exibirDetalhes(){
        System.out.println("Nome: " + getNome() +
                "\nIdade: " + getIdade());
    }

}
