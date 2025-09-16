package ExercsEncapsulamento;

public class Retangulo {

    private double largura;
    private double altura;

    public double getLargura() {
        return largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setLargura(double largura) {
        if (largura>=0) {
            this.largura = largura;
        } else {
            System.out.println("ERRO!LARGURA NAO PODE SER NEGATIVA!");
        }
    }


    public void setAltura(double altura) {
        if (altura>=0) {
            this.altura = altura;
        } else {
            System.out.println("ERRO!ALTURA NAO PODE SER NEGATIVA!");
        }
    }

    void calcularArea () {
        double area = largura*altura;
        System.out.println("Área: " +area);
    }

    void calcularPerimetro() {
        double perimetro = 2 * (altura + largura);
        System.out.println("Perímetro: " + perimetro);
    }

}