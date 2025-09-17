package Atividades_Aula_5;

class Moto extends Veiculos {
    public Moto(String placa, String modelo) {
        super(placa, modelo);
    }

    @Override
    public double calcularConsumo(double distancia, double litros) {
        // Motos costumam ser mais econômicas
        return (distancia / litros) * 1.2; // 20% mais eficiente
    }
}
