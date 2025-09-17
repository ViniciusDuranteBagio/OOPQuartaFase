package Atividades_Aula_5;

class Caminhao extends Veiculos {
    public Caminhao(String placa, String modelo) {
        super(placa, modelo);
    }

    @Override
    public double calcularConsumo(double distancia, double litros) {

        return (distancia / litros) * 0.7;
    }
}