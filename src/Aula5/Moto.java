package Aula5;

public class Moto extends Veiculo{
    public Moto(String placa, String modelo){
        super(placa, modelo);
    }
    @Override
    public double calcularConsumo(double distancia){
        return distancia/20;
    }
}
