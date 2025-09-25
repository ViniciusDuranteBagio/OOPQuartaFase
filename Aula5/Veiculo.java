package Aula5;

abstract class Veiculo {
    protected String modelo;
    protected String placa;
    protected double consumo;

    public Veiculo(String modelo, String placa){
        this.modelo = modelo;
        this.placa = placa;
    }

    void ligarMotor(){
        System.out.println("Motor Ligado!");
    }
    void abastecer(){
        System.out.println("Abastecendo!");
    }

    abstract double calcularConsumo(double km, double litros);
}
