public class Mago extends Personagem {
    private int mana;

    public Mago(String nome, int nivel, int mana) {
        super(nome, nivel);
        this.mana = mana;
    }

    public int getMana() {
        return mana;
    }
}
