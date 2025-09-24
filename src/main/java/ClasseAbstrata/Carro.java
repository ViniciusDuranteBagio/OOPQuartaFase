package ClasseAbstrata;

public class Carro extends Veiculo {
    private double consumoPorKm; // km por litro

    public Carro(String placa, String modelo, double consumoPorKm) {
        super(placa, modelo);
        this.consumoPorKm = consumoPorKm;
    }

    @Override
    public double calcularConsumo() {
        return consumoPorKm;
    }
}

