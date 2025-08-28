package main.java.org.example.Encapsulamento;

import javax.swing.*;

public class Retangulo {
    private  double altura;
    private double largura;

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if(altura > 0) {
            this.altura = altura;
        }
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        if(largura > 0) {
            this.largura = largura;
        }
    }
    public void  area() {
      int   area = (int) (altura * largura);
        JOptionPane.showMessageDialog(null, "A Área do rêtangulo: " + area);

    }
    public void  perimetro() {
       int perimetro = (int) ((altura + altura) * 2);
        JOptionPane.showMessageDialog(null,"O perimetro do rêtangulo: " + perimetro);
    }
}
