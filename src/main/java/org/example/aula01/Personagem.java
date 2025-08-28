package org.example.aula01;


public class Personagem {
    String nome;
    int idade;
    int nivel;

    public void mostrarStatus(){
        System.out.println("Informacoes do br.com.renan.poo.exemplos.Personagem: ");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Nivel: " + nivel);
    }
}