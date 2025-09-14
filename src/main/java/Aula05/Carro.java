package Aula05;

import Aula05.Veiculos;

public class Carro extends Veiculos {

    public Carro(String placa, String modelo, double km, double litrosCombustivel) {
        super(placa, modelo, km, litrosCombustivel);
    }

    @Override
    public String ligarMotor() {
        return "O carro " + modelo + " esta ligado!";
    }

    @Override
    public String abastecer() {
        return "Carro " + modelo + " foi abastecido com " + litrosCombustivel + " litros";
    }

    @Override
    public String calcularConsumo() {
        return String.format("Consumo (km/l): %.2f", km / litrosCombustivel);
    }
}
