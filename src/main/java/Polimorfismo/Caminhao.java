package Polimorfismo;

public class Caminhao extends Veiculos{
    public Caminhao(String modelo, String placa){
        super(modelo, placa);
    }
    @Override
    public double calcularConsumo(double distancia, double litros) {
        return distancia/litros;
    }
}
