package Atividades_Aula_5.src;

abstract class Veiculo {
    public String marca;
    public String placa;
    public double consumo;

    public void Veiculo(String marca, String placa) {
        this.marca = marca;
        this.placa = placa;
    }

    void ligarMotor() {
        System.out.println("Motor ligado!");
    }

    void abastecer() {
        System.out.println("Abastecendo!");
    }

    abstract double calcularConsumo(double km, double litros);
}