package ExerciciosAula3;

public class Retangulo {
    private double largura;
    private double altura;

    // --- Getters ---
    public double getLargura() {
        return largura;
    }

    public double getAltura() {
        return altura;
    }

    // --- Setters com Validação ---
    public void setLargura(double largura) {
        if (largura > 0) {
            this.largura = largura;
        } else {
            System.out.println("Erro: A largura deve ser maior que zero.");
        }
    }

    public void setAltura(double altura) {
        if (altura > 0) {
            this.altura = altura;
        } else {
            System.out.println("Erro: A altura deve ser maior que zero.");
        }
    }

    // --- Métodos de Cálculo ---
    public double calcularArea() {
        return this.largura * this.altura;
    }

    public double calcularPerimetro() {
        return 2 * (this.largura + this.altura);
    }
}