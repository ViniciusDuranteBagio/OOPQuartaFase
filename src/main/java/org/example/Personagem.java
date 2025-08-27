package org.example;

public class Personagem {
    public String nome;
    public int vida;
    public int nivel;
    
    public void mostrarStatus() {
        System.out.println("=== Status do Personagem ===");
        System.out.println("Nome: " + nome);
        System.out.println("Vida: " + vida);
        System.out.println("Nível: " + nivel);
        System.out.println("==========================");
    }
} 