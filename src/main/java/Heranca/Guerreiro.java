package Heranca;

public class Guerreiro extends Personagem {
    private int forca;

    public Guerreiro(String nome, int nivel, int forca) {
        super(nome, nivel);
        this.forca = forca;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Força: " + forca);
    }
}

