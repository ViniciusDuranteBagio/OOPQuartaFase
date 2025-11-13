package Aula4;

public class Guerreiro extends Personagem {
    private int forca;
    
    public Guerreiro(String nome, int nivel, int forca) {
        super(nome, nivel);
        this.forca = forca;
    }
    
    public int getForca() {
        return forca;
    }
    
    public void setForca(int forca) {
        this.forca = forca;
    }
    
    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Força: " + this.forca);
    }
} 