package Aula4.exercicio9;

public class Guerreiro extends Personagem {
    public int forca;

    public Guerreiro(String nome, int nivel, int forca) {
        super(nome, nivel);
        this.forca = forca;
    }
}