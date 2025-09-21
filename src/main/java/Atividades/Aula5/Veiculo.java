package Atividades.Aula5;

import javax.swing.*;

public abstract class Veiculo {
    protected String placa;
    protected String modelo;
    protected double tanque;

    public Veiculo(String placa, String modelo, double tanque) {
        this.placa = placa;
        this.modelo = modelo;
        this.tanque = tanque;
    }

    public void ligarMotor(){
        JOptionPane.showMessageDialog(null, modelo + " está com o motor ligado.");
    }

    public void abastecer(double litros){
        tanque += litros;
        JOptionPane.showMessageDialog(null, modelo + " abastecido com " + litros + " litros. " +
                "\nTanque atual: " + tanque + " litros.");
    }

    public abstract double calcularConsumo(double distancia);
}
