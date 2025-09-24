package ClasseAbstrata;

public abstract class Veiculo {
    protected String placa;
    protected String modelo;

    public Veiculo(String placa, String modelo) {
        this.placa = placa;
        this.modelo = modelo;
    }

    public void ligarMotor() {
        System.out.println(modelo + " ligado.");
    }

    public void abastecer(double litros) {
        System.out.println(modelo + " abastecido com " + litros + " litros.");
    }

    public abstract double calcularConsumo();
}