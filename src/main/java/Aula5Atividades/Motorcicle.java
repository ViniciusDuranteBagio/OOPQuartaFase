package Aula5Atividades;

public class Motorcicle extends Veiculos{
    public Motorcicle(String placa,String modelo) {
        super(placa,modelo);
    }
    @Override
    public double calcularConsumo() {
        return 18;
    }
}
