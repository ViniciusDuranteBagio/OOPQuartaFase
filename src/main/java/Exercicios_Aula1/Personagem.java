package Exercicios_Aula1;

public class Personagem {

    String nome;
    int vida;
    int nivel;

    public void mostrarStatus() {
        System.out.println("Status do personagem:\n" + "\nNome: " + nome + "\nVida: " + vida + "\nNível: " + nivel);
    }
}
