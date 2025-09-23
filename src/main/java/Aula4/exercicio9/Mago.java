package Aula4.exercicio9;


public class Mago extends Personagem {
    public int mana;

    public Mago(String nome, int nivel, int mana) {
        super(nome, nivel);
        this.mana = mana;
    }
}