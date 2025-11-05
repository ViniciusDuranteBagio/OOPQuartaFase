package org.example;

public class Caminhao extends Veiculo {
    public Caminhao(String placa, String modelo) {
        super(placa, modelo);
    }

    @Override
    public double calcularConsumo(double distancia, double combustivel) {
        return (distancia / combustivel) * 0.6;
    }
}

