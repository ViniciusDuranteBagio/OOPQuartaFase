package Atividades.Aula5;

public class Carro extends Veiculo{

    public Carro(String placa, String modelo, double tanque) {
        super(placa, modelo, tanque);
    }

    @Override
    public double calcularConsumo(double distancia) {
        double consumoPorKm = 0.1;
        return distancia * consumoPorKm;
    }
}
