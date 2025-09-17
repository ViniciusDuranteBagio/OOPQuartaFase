package exercicio_2;

public class Moto extends Veiculo {
    public Moto(String placa, String modelo) {
        super(placa, modelo);
    }

    @Override
    public double calcularConsumo(double km) {
        return km / 10;
    }
}