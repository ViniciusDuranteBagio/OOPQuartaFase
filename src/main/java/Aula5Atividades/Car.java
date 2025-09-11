package Aula5Atividades;

public class Car extends Veiculos {
    public Car(String placa, String modelo) {
        super(placa, modelo);
    }
    @Override
    public double calcularConsumo() {
        return 12.5;
    }
}
