package Aula4;

public class Veiculo {
    protected String marca;
    protected String modelo;

    public Veiculo (String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public void exibeInfo() {
        System.out.println("Marca: " + marca + "\nModelo: " + modelo);
    }
}
