package Aula4;

public class Mago extends Personagem{
    private int mana;

    public Mago(String nome, int idade, int mana) {
        super(nome, idade);
        this.mana = mana;
    }

    public int getMana() {
        return mana;
    }

    @Override
    public void exibirDetalhes(){
        super.exibirDetalhes();
        System.out.println("Mana: " + getMana());
    }
}
