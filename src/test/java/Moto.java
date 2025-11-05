package org.example;

public class Moto extends Veiculo {
    public Moto(String placa, String modelo) {
        super(placa, modelo);
    }

    @Override
    public double calcularConsumo(double distancia, double combustivel) {
        return (distancia / combustivel) * 1.2;
    }
}
