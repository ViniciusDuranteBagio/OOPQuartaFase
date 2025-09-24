package Encapsulamento.pack5;

public class Retangulo {
    private double largura;
    private double altura;

    public Retangulo(){
        this.largura = 1.0;
        this.altura = 1.0;
    }

    public Retangulo(double largura, double altura){
        setLargura(largura);
        setAltura(altura);
    }

    public double getLargura(){
        return largura;
    }
    public double getAltura(){
        return altura;
    }

    public void setLargura(double largura){
        if (largura > 0){
            this.largura = largura;
        }else {
            System.out.println("A largura deve ser maior que zero.");
        }
    }

    public void setAltura(double altura){
        if (altura > 0) {
            this.altura = altura;
        } else {
            System.out.println("A altura deve ser maior que zero.");
        }
    }

    public double calculoArea(){
        return altura * largura;
    }

    public double calculoPerimetro(){
        return 2*(altura + largura);
    }

    public void exibirInformacoes() {
        System.out.println("Retângulo:");
        System.out.println("Largura: " + largura);
        System.out.println("Altura: " + altura);
        System.out.println("Área: " + calculoArea());
        System.out.println("Perímetro: " + calculoPerimetro());
        System.out.println("-------------------");
    }
}

