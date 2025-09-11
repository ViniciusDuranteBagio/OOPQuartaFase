package polimorfismo.atividades.ativ2;

public class Moto extends Veiculo{

    public Moto(String placa, String modelo, double distancia, double litros) {
        super(placa, modelo, distancia, litros);
    }

    @Override
    public double calcularConsumo() {
        return distancia / litros;
    }
}
