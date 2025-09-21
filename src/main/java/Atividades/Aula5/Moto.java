package Atividades.Aula5;

public class Moto extends  Veiculo{

    public Moto(String placa, String modelo, double tanque) {
        super(placa, modelo, tanque);
    }

    @Override
    public double calcularConsumo(double distancia) {
        double consumoPorKm = 0.05;
        return distancia * consumoPorKm;
    }
}
