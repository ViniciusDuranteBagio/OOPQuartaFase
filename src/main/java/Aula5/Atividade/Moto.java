package Aula5.Atividade;

public class Moto extends Veiculo{

    public Moto(String placa, String modelo) {
        super(placa, modelo);
    }

    @Override
    public double calcularConsumo(double distancia) {
        double consumo = distancia / 20.0; // 20 km por litro
        System.out.println("Moto consumiu " + consumo + " litros em " + distancia + " km.");
        return consumo;
    }

    @Override
    public double calcularConsumo() {
        return 0;
    }
}
