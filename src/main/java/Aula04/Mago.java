package Aula04;

public class Mago extends Personagem {
    protected int mana;

    public Mago(String nome, int nivel, int mana) {
        super(nome, nivel);
        this.mana = mana;
    }

    @Override
    public void imprimirInfoPersonagem() {
        super.imprimirInfoPersonagem();
        System.out.println("Mana: " + this.mana);
    }
}
