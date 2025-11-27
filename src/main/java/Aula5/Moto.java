public class Moto extends Veiculo {
    public Moto(String placa, String modelo) {
        super(placa, modelo);
    }

    public double calcularConsumo() {
        return 30;
    }
}
