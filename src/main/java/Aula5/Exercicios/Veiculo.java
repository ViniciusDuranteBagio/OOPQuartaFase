package Aula5.Exercicios;

public abstract class Veiculo {
    protected String placa;
    protected String modelo;

    public Veiculo(String placa, String modelo) {
        this.placa = placa;
        this.modelo = modelo;
    }

    public void ligarMotor() {
        System.out.println(modelo + " com placa " + placa + " ligou o motor.");
    }

    public void abastecer() {
        System.out.println(modelo + " foi abastecido.");
    }

    public abstract double calcularConsumo(double distanciaKm);
}
