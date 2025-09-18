package Aula5.Exercicios;

public class Moto extends Veiculo {
    public Moto(String placa, String modelo) {
        super(placa, modelo);
    }
    @Override
    public double calcularConsumo(double distanciaKm) {
        return distanciaKm / 25;
    }
}
