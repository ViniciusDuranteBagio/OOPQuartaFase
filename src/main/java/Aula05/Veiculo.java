package Aula05;

public abstract class Veiculo {
    protected String placa;
    protected String modelo;

    public Veiculo(String placa, String modelo) {
        this.placa = placa;
        this.modelo = modelo;
    }

    public void ligarMotor() {
        System.out.println(modelo + " (placa " + placa + ") ligou o motor.");
    }

    public void abastecer() {
        System.out.println(modelo + " foi abastecido.");
    }

    public abstract double calcularConsumo(double km);
}


class Carro extends Veiculo {
    public Carro(String placa, String modelo) {
        super(placa, modelo);
    }

    @Override
    public double calcularConsumo(double km) {
        return km / 12; // 12 km/l
    }
}

class Moto extends Veiculo {
    public Moto(String placa, String modelo) {
        super(placa, modelo);
    }

    @Override
    public double calcularConsumo(double km) {
        return km / 25; // 25 km/l
    }
}