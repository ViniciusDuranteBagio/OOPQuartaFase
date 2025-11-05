package org.example;

public class Veiculo {
    protected String placa;
    protected String modelo;

    public Veiculo(String placa, String modelo) {
        this.placa = placa;
        this.modelo = modelo;
    }

    public void ligarMotor() {
        System.out.println(modelo + " (placa " + placa + ") ligando o motor...");
    }

    public void abastecer() {
        System.out.println(modelo + " (placa " + placa + ") está sendo abastecido.");
    }

    public double calcularConsumo(double distancia, double combustivel) {
        return distancia / combustivel;
    }

    public void exibirDados() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Placa: " + placa);
    }
}

