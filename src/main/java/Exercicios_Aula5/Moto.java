package Exercicios_Aula5;

public class Moto extends Veiculo {

    public void Veiculo(String marca, String placa) {
        super.Veiculo(marca, placa);
    }

    @Override
    double calcularConsumo(double km, double litros) {
        consumo = km / litros;
        System.out.println("Consumo: " + consumo + " km/l");
        return 0;
    }
}