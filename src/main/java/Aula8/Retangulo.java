package Aula8;

public class Retangulo {
    private double largura;
    private double altura;

    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;

    }

    public double calcularArea() {
        return altura * largura;
    }

    public double calcularPerimetro() { // considerando que todos tenham bases e lados de mesmo tamanho ne
        return 2 * (altura + largura);
    }

    public double getLargura() {
        return largura;
    }

    public double getAltura() {
        return altura;
    }
}
