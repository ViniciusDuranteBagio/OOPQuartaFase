package exercicio3;

public class Moto extends Veiculo {
    public int cilindrada;

    public Moto(String marca, String modelo, int cilindrada) {
        super(marca, modelo);
        this.cilindrada = cilindrada;
    }
}
