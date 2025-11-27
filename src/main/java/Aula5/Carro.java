public class Carro extends Veiculo {
    public Carro(String placa, String modelo) {
        super(placa, modelo);
    }

    public double calcularConsumo() {
        return 12;
    }
}
