package Polimorfismo;

public abstract class Veiculos {
    String modelo;
    String placa;




    public Veiculos(String modelo, String placa) {
        this.modelo = modelo;
        this.placa = placa;
    }

    public void ligarMotor() {
        System.out.println("Ligando Motor");
    }
    public void abastecer() {
        System.out.println("Abastecendo");
    }

   public abstract double calcularConsumo(double distancia, double litros);

    public void exibirVeiculo() {

    }














}
