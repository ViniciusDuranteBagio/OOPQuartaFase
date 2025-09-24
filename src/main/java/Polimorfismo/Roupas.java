package Polimorfismo;

import javax.swing.*;

public class Roupas extends Produtos{
    double peso;
    public Roupas(String nome, double preco,  double peso) {
        super(nome, preco);
        this.peso = peso;
    }

    @Override
    public double calcularFrete() {
        return peso * 0.1;
    }
}
