package polimorfismo.atividades.ativ2;

public class Caminhao extends Veiculo{

    public Caminhao(String placa, String modelo, double distancia, double litros) {
        super(placa, modelo, distancia, litros);
    }

    @Override
    public double calcularConsumo() {
        return distancia / litros;
    }
}
