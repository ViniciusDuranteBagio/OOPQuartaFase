package Aula8;

public class Retangulo {
    private double largura;
    private double altura;

    public Retangulo(double largura, double altura) {
        this.altura = altura;
        this.largura = largura;
    }

    public double calcularArea() {
        return  altura*largura;
    }
    public double calcularPerimetro() {
        return (2*altura) + (2*largura);
    }
}

