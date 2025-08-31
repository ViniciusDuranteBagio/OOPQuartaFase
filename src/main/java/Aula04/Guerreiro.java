package Aula04;

public class Guerreiro extends Personagem {
    protected int forca;

    public Guerreiro(String nome, int nivel, int forca) {
        super(nome, nivel);
        this.forca = forca;
    }

    @Override
    public void imprimirInfoPersonagem() {
        super.imprimirInfoPersonagem();
        System.out.println("Forca: " + this.forca);
    }
}
