package ClasseAbstrata;

public class Caminhao extends Veiculo {
    private double consumoPorKm;

    public Caminhao(String placa, String modelo, double consumoPorKm) {
        super(placa, modelo);
        this.consumoPorKm = consumoPorKm;
    }

    @Override
    public double calcularConsumo() {
        return consumoPorKm;
    }
}