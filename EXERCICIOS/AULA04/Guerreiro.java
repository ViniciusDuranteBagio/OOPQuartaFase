public class Guerreiro extends Personagem {
    private int forca;

    public Guerreiro(String nome, int nivel, int forca) {
        super(nome, nivel);
        this.forca = forca;
    }

    public int getForca() {
        return forca;
    }
}
