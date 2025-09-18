package ExerciciosAula5;

public abstract class Veiculo {
    protected String placa;
    protected String modelo;

    public Veiculo(String placa, String modelo) {
        this.placa = placa;
        this.modelo = modelo;
    }

    public void ligarMotor() {
        System.out.println("O motor do " + this.modelo + " está ligado.");
    }

    public void abastecer() {
        System.out.println("O " + this.modelo + " está sendo abastecido.");
    }

    public abstract double calcularConsumo(double distanciaKm);
}