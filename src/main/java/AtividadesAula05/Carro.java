package AtividadesAula05;

public class Carro extends Veiculos {

    public Carro (String placa, String modelo) {
        super (placa, modelo);
    }
    @Override
    public void calcularConsumo() {
        System.out.println("Consumo " + modelo + " : 12 km/h");
    }
}
