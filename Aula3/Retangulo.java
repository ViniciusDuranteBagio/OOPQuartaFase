package Aula3;

public class Retangulo {
    private double largura;
    private double altura;
    public Retangulo(double largura, double altura){
        this.largura = largura;
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }
    public void setLargura(double largura) {
        if(largura > 0){
            this.largura = largura;
        }else {
            System.out.println("Valor inválido! Largura deve ser maior que zero.");
        }
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        if(altura > 0){
            this.altura = altura;
        }else{
            System.out.println("Valor inválido! Altura deve ser maior que zero.");
        }
    }

    public void calcularArea(){
        System.out.println("Área: " + this.largura * this.altura);
    }

    public void calcularPerimetro(){
        System.out.println("Perímetro: " + 2 * (this.largura + this.altura));
    }
}