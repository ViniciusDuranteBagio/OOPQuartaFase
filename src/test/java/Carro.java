package org.example;

public class Carro extends Veiculo {
    public Carro(String placa, String modelo) {
        super(placa, modelo);
    }

    @Override
    public double calcularConsumo(double distancia, double combustivel) {
        return distancia / combustivel;
    }
}
