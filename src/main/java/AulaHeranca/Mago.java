package AulaHeranca;

public class Mago extends Personagem {

    int mana;

    public Mago (String nome, int nivel, int mana) {
        super(nome, nivel);
        this.mana = mana;
    }
    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Mana: " + mana);
    }
}
