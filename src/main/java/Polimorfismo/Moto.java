package Polimorfismo;

public class Moto extends Veiculos{

    public Moto(String modelo, String placa) {
        super(modelo, placa);
    }

    @Override
    public double calcularConsumo(double distancia, double litros) {
        return distancia/litros;
    }
}
