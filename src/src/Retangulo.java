import javax.swing.*;

public class Retangulo {
    private double largura;
    private double altura;

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        if (largura < 0) {
            JOptionPane.showMessageDialog(null, "Valor inválido, insira um valor válido");
        } else {
            this.largura = largura;
        }
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if (altura < 0) {
            JOptionPane.showMessageDialog(null, "Valor inválido, insira um valor válido");
        } else {
            this.altura = altura;
        }
    }

    public double calcularArea() {
        return altura*largura;
    }
    public double calcularPerimetro() {
        return 2*(altura+largura);
    }
}
