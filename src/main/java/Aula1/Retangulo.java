public class Retangulo {

    private double altura;
    private double largura;

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        if (largura > 0) {
            this.largura = largura;
        } else {
            System.out.println("Largura inválida. Tente novamente");
        }
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if (altura > 0) {
            this.altura = altura;
        } else {
            System.out.println("Altura inválida. Tente novamente");
        }
    }
    public void calcularArea () {
        System.out.println("Altura: " + altura + " Largura: " + largura + "\n" + "Área = " + (altura*largura));
    }
    public void calcularPerimetro () {
        System.out.println("Altura: " + altura + " Largura: " + largura + "\n" + "Perímetro = " + 2*(altura+largura));
    }
}
