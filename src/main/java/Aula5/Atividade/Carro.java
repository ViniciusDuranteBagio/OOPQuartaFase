package Aula5.Atividade;

public class Carro extends Veiculo{

    public Carro(String marca, String modelo){
        super(marca,modelo);
    }

    @Override
    public double calcularConsumo(double distancia) {
        return 0;
    }

    @Override
    public double calcularConsumo() {
        return 0;
    }
}
