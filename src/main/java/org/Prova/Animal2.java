package org.Prova;

public class Animal2 {
    //Questão07
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
    public void fazerSom() {
        System.out.println(getNome() + " fez algum som.");
    }
}/*
public class Cachorro extends Animal {
    public void fazerSom() {
        System.out.println(getNome() + " (" + getIdade() + " anos) latiu: Au Au!");
    }
}
public class Gato extends Animal {
    public void fazerSom() {
        System.out.println(getNome() + " (" + getIdade() + " anos) miou: Miau!");
    }*/