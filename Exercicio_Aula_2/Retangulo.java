package classe.Exercicio_Aula_2;

public class Retangulo {
    private double largura;
    private double altura;


    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        if(largura >0) {
            this.largura = largura;
            System.out.println("A largura foi editada para " + largura);
        }else {
            System.out.println("A largura precisa ser maior que 0");
        }
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if(altura >0) {
            this.altura = altura;
            System.out.println("A Altura foi editada para " + altura);
        }else {
            System.out.println("A Altura precisa ser maior que 0");
        }

    }

    public void CalcularArea(){
        double Area = (this.largura * this.altura);
        System.out.println("A area total e igual a: " + Area);
    }

    public void CalcularPerimetro(){
        double perimetro = 2 * (this.largura + this.altura);
        System.out.println("O perimetro e igual a: " + perimetro);
    }
}
