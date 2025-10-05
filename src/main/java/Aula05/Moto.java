package Aula05;

import Aula05.Veiculos;

public class Moto extends Veiculos {


    public Moto(String placa, String modelo, double km, double litrosCombustivel) {
        super(placa, modelo, km, litrosCombustivel);
    }

    @Override
    public String ligarMotor() {
        return "Moto " + modelo + " ligada!";
    }

    @Override
    public String abastecer() {
        return "Moto " + modelo + " abastecida com " + litrosCombustivel + " litros";
    }

    @Override
    public String calcularConsumo() {
        return String.format("Consumo (km/l): %.2f", km / litrosCombustivel);
    }
}
