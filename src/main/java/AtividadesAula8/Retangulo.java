package AtividadesAula8;

public class Retangulo {
    private double altura;
    private double largura;

    public Retangulo (double altura, double largura){
        this.altura = altura;
        this.largura = largura;
    }

    public double getAltura() {
        return altura;
    }

    public double getLargura() {
        return largura;
    }

    public double calcularArea(){
        return altura*largura;
    }

    public double calcularPerimetro(){
        return (altura*2) + (largura*2);
    }
}
