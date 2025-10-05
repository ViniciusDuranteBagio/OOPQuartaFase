package Aula05;

public class Caminhao extends Veiculos {

    public Caminhao(String placa, String modelo, double km, double litrosCombustivel) {
        super(placa, modelo, km, litrosCombustivel);
    }

    @Override
    public String ligarMotor() {
        return "Caminhao " + modelo + " esta ligado!";
    }

    @Override
    public String abastecer() {
        return "Caminhao " + modelo + " foi abastecido com " + litrosCombustivel + " litros";
    }

    @Override
    public String calcularConsumo() {
        return String.format("Consumo (km/l): %.2f", km / litrosCombustivel);
    }


}
