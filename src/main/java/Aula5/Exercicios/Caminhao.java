package Aula5.Exercicios;

public class Caminhao extends Veiculo {
    public Caminhao(String placa, String modelo) {
        super(placa, modelo);
    }
    @Override
    public double calcularConsumo(double distanciaKm) {
        return distanciaKm / 5;
    }
}