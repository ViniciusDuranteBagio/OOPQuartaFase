package ExerciciosAula5;

public class Caminhao extends Veiculo {
    public Caminhao(String placa, String modelo) { super(placa, modelo); }

    @Override
    public double calcularConsumo(double distanciaKm) {
        return distanciaKm / 4.0; // Consumo médio: 4 km/l
    }
}
