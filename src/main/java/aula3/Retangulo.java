package aula3;

public class Retangulo {  private double largura;
    private double altura;

    public Retangulo() {
        super();
    }

    public double getLargura() {
        return this.largura;
    }

    public void setLargura(double largura) {
        if (largura > 0.0) {
            this.largura = largura;
        } else {
            System.out.println("Largura inv\u00e1lida!");
        }

    }

    public double getAltura() {
        return this.altura;
    }

    public void setAltura(double altura) {
        if (altura > 0.0) {
            this.altura = altura;
        } else {
            System.out.println("Altura inv\u00e1lida!");
        }

    }

    public double calcularArea() {
        return this.largura * this.altura;
    }

    public double calcularPerimetro() {
        return 2.0 * (this.largura + this.altura);
    }
}
