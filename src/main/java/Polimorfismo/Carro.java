package Polimorfismo;

public class Carro extends Veiculos{
    public Carro(String modelo, String placa) {
        super(modelo, placa);
    }


    @Override
    public double calcularConsumo(double distancia, double litros) {
        return distancia/litros;
    }
}
