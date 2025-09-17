package exercicio_2;

public class Caminhao extends Veiculo {
    public Caminhao(String placa, String modelo) {
        super(placa, modelo);
    }

    @Override
    public double calcularConsumo(double km) {
        return km / 5;
    }
}