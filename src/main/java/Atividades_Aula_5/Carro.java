package Atividades_Aula_5;


class Carro extends Veiculos {
    public Carro(String placa, String modelo) {
        super(placa, modelo);
    }

    @Override
    public double calcularConsumo(double distancia, double litros) {

        return distancia / litros;
    }
}
