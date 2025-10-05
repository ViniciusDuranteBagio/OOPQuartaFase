package Aula05;

public abstract class Veiculos {
    protected String placa;
    protected String modelo;
    protected double km;
    protected double litrosCombustivel;

    public Veiculos(String placa, String modelo,  double km, double litrosCombustivel) {
        this.placa = placa;
        this.modelo = modelo;
        this.km = km;
        this.litrosCombustivel = litrosCombustivel;
    }

    public abstract String ligarMotor();
    public abstract String abastecer();
    public abstract String calcularConsumo();

    public void exibirDados(){
        System.out.println("Placa: " + placa);
        System.out.println("Modelo: " + modelo);
        System.out.println("Consumo: " + calcularConsumo());
        System.out.println("--------------------");
    }
}
