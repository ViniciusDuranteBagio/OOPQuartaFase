package Aula5;

public class Caminhao extends Veiculo{
    public Caminhao(String placa, String modelo){
        super(placa,modelo);
    }
    @Override
    public double calcularConsumo(double distancia){
        return distancia/5;
    }
}
