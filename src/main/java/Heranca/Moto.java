package Heranca;

public class Moto extends Veiculo {
    private int cilindrada;

    public Moto(String marca, String modelo, int cilindrada) {
        super(marca, modelo);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public String toString() {
        return "Moto [marca=" + getMarca() + ", modelo=" + getModelo() + ", cilindrada=" + cilindrada + "]";
    }
}
