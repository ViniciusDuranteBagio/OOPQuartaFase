package ClasseAbstrata;

public class Moto extends Veiculo {
    private double consumoPorKm;

    public Moto(String placa, String modelo, double consumoPorKm) {
        super(placa, modelo);
        this.consumoPorKm = consumoPorKm;
    }

    @Override
    public double calcularConsumo() {
        return consumoPorKm;
    }
}
