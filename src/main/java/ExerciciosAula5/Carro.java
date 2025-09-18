package ExerciciosAula5;

public class Carro extends Veiculo {
    public Carro(String placa, String modelo) { super(placa, modelo); }

    @Override
    public double calcularConsumo(double distanciaKm) {
        return distanciaKm / 12.0; // Consumo médio: 12 km/l
    }
}