package Aula5.Atividade;

public class Caminhao extends Veiculo{
    public Caminhao(String placa, String modelo) {
        super(placa, modelo);
    }

    @Override
    public double calcularConsumo(double distancia) {
        double consumo = distancia / 6.0; // 6 km por litro
        System.out.println("Caminhão consumiu " + consumo + " litros em " + distancia + " km.");
        return consumo;
    }

    @Override
    public double calcularConsumo() {
        return 0;
    }
}
