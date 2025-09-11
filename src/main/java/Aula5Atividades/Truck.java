package Aula5Atividades;

public class Truck extends Motorcicle {
    public Truck(String placa,String modelo, double tanqueAtual, double consumoPorLitro) {
        super(placa,modelo);
    }
    @Override
    public double calcularConsumo() {
        return 6.0 ;
    }
}
