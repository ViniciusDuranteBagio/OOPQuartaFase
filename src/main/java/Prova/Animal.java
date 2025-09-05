package Prova;

public class Animal {
    private String nome3;
    private int idade3;

    public Animal(String nome3, int idade3) {
        this.nome3 = nome3;
        this.idade3 = idade3;
    }

    public String getNome3() {
        return nome3;
    }

    public void setNome3(String nome) {
        this.nome3 = nome;
    }

    public int getIdade() {
        return idade3;
    }

    public void setIdade(int idade3) {
        this.idade3 = idade3;
    }

    public void fazerSom() {
        System.out.println(nome3 + ", " + idade3 + " anos, fez algum som.");
    }
}
