package Prova;

public class Animal {
    private String nome;
    private int idade;

    public Animal(String nomeInicial, int idadeInicial){
        this.nome = nomeInicial;
        this.idade = idadeInicial;
    }



    public void fazerSom(){
        System.out.println("O animal "+nome+", de "+idade+" anos, fez alguem som");

    }

    public String getNome() {
        return nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
