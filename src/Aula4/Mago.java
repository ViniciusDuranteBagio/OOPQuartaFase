package Aula4;

public class Mago extends Personagem {
    private int mana;


    public Mago(String nome, int nivel, int mana) {
        super(nome, nivel);
        this.mana = mana;
    }


    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }


    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Mana: " + this.mana);
    }
}