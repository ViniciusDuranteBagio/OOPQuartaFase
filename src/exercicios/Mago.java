package exercicios;

class Mago extends Personagem {
    int mana;

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Mana: " + mana);
    }
}
