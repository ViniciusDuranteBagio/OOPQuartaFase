package exercicio_2;

abstract class Veiculo {
    protected String placa;
    protected String modelo;

    public Veiculo(String placa, String modelo) {
        this.placa = placa;
        this.modelo = modelo;
    }

    public void ligarMotor() {
        System.out.println(modelo + " (" + placa + ") está com o motor ligado.");
    }

    public void abastecer() {
        System.out.println(modelo + " (" + placa + ") foi abastecido.");
    }

    public abstract double calcularConsumo(double km);

    public void exibirDados(double km) {
        System.out.println("Modelo: " + modelo);
        System.out.println("Placa: " + placa);
        System.out.println("Distância percorrida: " + km + " km");
        System.out.println("Consumo: " + calcularConsumo(km) + " litros");
        System.out.println(" ");
    }
}

