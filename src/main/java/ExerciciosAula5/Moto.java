package ExerciciosAula5;

public class Moto extends Veiculo {
    public Moto(String placa, String modelo) { super(placa, modelo); }

    @Override
    public double calcularConsumo(double distanciaKm) {
        return distanciaKm / 25.0; // Consumo médio: 25 km/l
    }
}