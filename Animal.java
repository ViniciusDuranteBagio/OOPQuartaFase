package Aula5;

public abstract class Animal {
    public boolean isVivo;
    public boolean isDoente;
    public String nome;

    public Animal(String nome, boolean isVivo, boolean isDoente) {
        this.nome = nome;
        this.isVivo = isVivo;
        this.isDoente = isDoente;
    }

    public abstract void fazerSom();
}
