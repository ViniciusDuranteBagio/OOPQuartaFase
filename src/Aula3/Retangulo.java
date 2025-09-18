package Aula3;

public class Retangulo {
    private double largura;
    private double altura;
    
    // Construtor
    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }
    
    // Getters e Setters
    public double getLargura() {
        return largura;
    }
    
    public void setLargura(double largura) {
        if (largura > 0) {
            this.largura = largura;
        } else {
            System.out.println("Erro: A largura deve ser maior que zero.");
        }
    }
    
    public double getAltura() {
        return altura;
    }
    
    public void setAltura(double altura) {
        if (altura > 0) {
            this.altura = altura;
        } else {
            System.out.println("Erro: A altura deve ser maior que zero.");
        }
    }
    
    // Método para calcular área
    public double calcularArea() {
        return largura * altura;
    }
    
    // Método para calcular perímetro
    public double calcularPerimetro() {
        return 2 * (altura + largura);
    }
    
    // Método para exibir informações do retângulo
    public void exibirInformacoes() {
        System.out.println("=== Informações do Retângulo ===");
        System.out.println("Largura: " + this.largura);
        System.out.println("Altura: " + this.altura);
        System.out.println("Área: " + calcularArea());
        System.out.println("Perímetro: " + calcularPerimetro());
        System.out.println("================================");
    }
} 