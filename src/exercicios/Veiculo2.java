package exercicios;

abstract class Veiculo2 {
    String placa;
    String modelo;

    public void ligarMotor() {
        System.out.println("Motor ligado - " + modelo);
    }

    public void abastecer() {
        System.out.println("Veículo abastecido - " + modelo);
    }

    public abstract double calcularConsumo();
}
