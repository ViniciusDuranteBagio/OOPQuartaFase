package Aula04;

public class Moto extends Veiculo {
    protected int cilindrada;

    public Moto (String marca, String modelo, int cilindrada) {
        super(marca, modelo);
        this.cilindrada = cilindrada;
    }
    public void imprimirInfoMoto() {
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cilindrada: " + this.cilindrada);
    }
}
