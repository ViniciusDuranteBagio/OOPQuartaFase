package Aula7BrenoLibrelatoManoel;

public class Retangulo {

    private double largura;
    private double altura;

    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public double getAltura() {
        return altura;
    }

    public int calcularArea(int largura, int altura){
        return  largura * altura;
    }

    public int calcularPerimetro(int largura, int altura){
        return largura * altura;
    }
}
