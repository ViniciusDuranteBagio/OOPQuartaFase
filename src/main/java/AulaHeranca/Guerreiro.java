package AulaHeranca;

public class Guerreiro extends Personagem {

    int forca;

    public Guerreiro (String nome, int nivel, int forca) {
        super(nome, nivel);
        this.forca = forca;

    }
    @Override
    public void exibirInformacoes () {
        super.exibirInformacoes();
        System.out.println("Força: " + forca);

    }
}
