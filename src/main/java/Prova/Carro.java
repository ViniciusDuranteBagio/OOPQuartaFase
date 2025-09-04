package Prova;

import javax.swing.*;

public class Carro {

    private int ano;
    private String marca;

    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void exibirDados(){
        JOptionPane.showMessageDialog(null, "marca: " + marca);
        JOptionPane.showMessageDialog(null, "ano: " + ano);
    }
}
