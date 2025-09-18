package Aula_3_Breno;

public class Retangulo {

    private int largura;
    private int altura;

    public void setAltura(int altura) {
        if (altura > 0) {
            this.altura = altura;
        } else {
            System.out.println("Altura invalida");
        }
    }

    public int getAltura() {
        return altura;
    }

    public void setLargura(int largura) {
        if (largura > 0) {
            this.largura = largura;
        } else {
            System.out.println("Largura invalida");
        }
    }

    public int getLargura() {
        return largura;
    }

    public void calcularArea() {
        System.out.println("Area do retangulo: " + (this.largura * this.altura));
    }

    public void calcularPerimetro() {
        System.out.println("Perimetro do retangulo: " + (2 * (this.largura + this.altura)));
    }
}