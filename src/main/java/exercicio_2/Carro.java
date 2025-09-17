package exercicio_2;

public class Carro extends Veiculo {

    public Carro(String placa, String modelo) {
        super(placa, modelo);
    }

    @Override
    public double calcularConsumo(double km) {
        return km / 8;
    }
}