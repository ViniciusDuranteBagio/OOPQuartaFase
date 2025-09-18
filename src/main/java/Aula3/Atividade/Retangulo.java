package Aula3.Atividade;

public class Retangulo {
    private double largura;
    private double altura;

    public Retangulo(double largura, double altura){
        this.altura=altura;
        this.largura=largura;
    }

    public double getAltura() {
        return altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setAltura(double altura) {
        if (altura > 0) {
            this.altura = altura;

        } else {
            System.out.println("Valor da altura precisa ser maior que 0");

        }
    }

    public void setLargura(double largura) {
        if (largura > 0){
            this.largura = largura;

        }else{
            System.out.println("Largura precisa ser maior que 0");
        }

    }

    public double calcularArea(){
        return largura*altura;

    }
    public double calcularPerimetro(){
        return 2*(altura + largura);
    }

    public void status(){
        System.out.println("=== Informações do Retângulo ===");
        System.out.println("Largura: " + this.largura);
        System.out.println("Altura: " + this.altura);
        System.out.println("Área: " + calcularArea());
        System.out.println("Perímetro: " + calcularPerimetro());
        System.out.println("================================");
    }




}
