package Aula5;

public class Carro extends Veiculo{
    public Carro(String placa, String modelo){
        super(placa, modelo);
    }
    @Override
    public double calcularConsumo(double distancia){
        return distancia/12;
    }
}
