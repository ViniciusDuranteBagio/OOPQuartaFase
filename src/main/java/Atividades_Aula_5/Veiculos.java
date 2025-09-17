package Atividades_Aula_5;

abstract class Veiculos {
    protected String placa;
    protected String modelo;

    public Veiculos(String placa, String modelo) {
        this.placa = placa;
        this.modelo = modelo;
    }

    // Métodos comuns
    public void ligarMotor() {
        System.out.println(modelo + " (" + placa + ") motor ligado!");
    }

    public void abastecer() {
        System.out.println(modelo + " (" + placa + ") abastecido!");
    }


    public abstract double calcularConsumo(double distancia, double litros);
}
