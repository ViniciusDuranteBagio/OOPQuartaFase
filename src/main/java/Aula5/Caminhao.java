public class Caminhao extends Veiculo {
    public Caminhao(String placa, String modelo) {
        super(placa, modelo);
    }

    public double calcularConsumo() {
        return 6;
    }
}
