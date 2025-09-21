package Atividades.Aula5;

public class Caminhao extends  Veiculo{

    public Caminhao(String placa, String modelo, double tanque) {
        super(placa, modelo, tanque);
    }

    @Override
    public double calcularConsumo(double distancia) {
        double consumoPorKm = 0.2;
        return distancia * consumoPorKm;
    }
}
