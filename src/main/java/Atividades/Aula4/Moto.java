package Atividades.Aula4;

public class Moto extends Veiculo{
    protected double cilindrada;

    Moto(String marca, String modelo, double cilindrada ) {
        super(marca, modelo);
        this.cilindrada = cilindrada;
    }
}
