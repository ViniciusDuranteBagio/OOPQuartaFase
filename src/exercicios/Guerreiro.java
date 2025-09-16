package exercicios;

class Guerreiro extends Personagem {
    int forca;

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Força: " + forca);
    }
}
