package polimorfismo.atividades.ativ2;

public abstract class Veiculo {

    String placa;
    String modelo;
    double distancia;
    double litros;

    public Veiculo (String placa, String modelo, double distancia, double litros) {
        this.modelo = modelo;
        this.placa = placa;
        this.distancia = distancia;
        this.litros = litros;
    }

    public void ligarMotor() {
        System.out.println(modelo + " está ligado!");
    }

    public void abastecer() {
        System.out.println(modelo + " abastecido com " + litros + " litros.");
    }

    public abstract double calcularConsumo();

}

