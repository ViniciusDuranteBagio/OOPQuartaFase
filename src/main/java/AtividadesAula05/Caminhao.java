package AtividadesAula05;

public class Caminhao extends Veiculos {

    public Caminhao (String placa, String modelo) {
        super (placa, modelo);
    }
    @Override
    public void calcularConsumo() {
        System.out.println("Consumo " + modelo + " : 16 km/h");
    }
}
