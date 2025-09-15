package Aula4;

public class Guerreiro extends Personagem{
    private int forca;

    public Guerreiro(String nome, int idade, int forca) {
        super(nome, idade);
        this.forca = forca;
    }

    public int getForca() {
        return forca;
    }

    @Override
    public void exibirDetalhes(){
        super.exibirDetalhes();
        System.out.println("Força: " + getForca());
    }
}
