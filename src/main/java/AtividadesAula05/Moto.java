package AtividadesAula05;

public class Moto extends Veiculos {

    public Moto (String placa, String modelo) {
        super (placa, modelo);
    }
    @Override
    public void calcularConsumo() {
        System.out.println("Consumo " + modelo + " : 7 km/h");
    }
}

