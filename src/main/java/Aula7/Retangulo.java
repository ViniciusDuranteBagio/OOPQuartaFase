package Aula7;

public class Retangulo {

    private int largura;
    private int altura;

    public Retangulo(int largura, int altura) {
        this.largura = largura;
        this.altura = altura;
    }

    public int calcularArea() {
        return largura * altura;
    }

    public int calcularPerimetro() {
        return 2 * (largura + altura);
    }

    public int getLargura() {
        return largura;
    }

    public int getAltura() {
        return altura;
    }
}
