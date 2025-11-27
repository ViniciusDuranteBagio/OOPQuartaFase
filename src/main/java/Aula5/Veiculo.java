public abstract class Veiculo {
    protected String placa;
    protected String modelo;

    public Veiculo(String placa, String modelo) {
        this.placa = placa;
        this.modelo = modelo;
    }

    public void ligarMotor() {
        System.out.println(modelo + " ligando motor...");
    }

    public void abastecer() {
        System.out.println("Abastecendo veículo.");
    }

    public abstract double calcularConsumo();
}
