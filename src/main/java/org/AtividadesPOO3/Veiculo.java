package org.AtividadesPOO3;
//Atividade02 PolimorfismoAula05
    public interface Veiculo {
    void ligarMotor();
    void abastecer(double litros);
    double calcularConsumo(double distancia, double litros);
    void exibirInfo();
}
    class Carro implements Veiculo {
    private String placa;
    private String modelo;

    public Carro(String placa, String modelo) {
        this.placa = placa;
        this.modelo = modelo;
    }

    @Override
    public void ligarMotor() {
        System.out.println("O carro " + modelo + " está ligando o motor...");
    }

    @Override
    public void abastecer(double litros) {
        System.out.println("Abastecendo carro com " + litros + " litros");
    }

    @Override
    public double calcularConsumo(double distancia, double litros) {
        return distancia / litros;
    }

    @Override
    public void exibirInfo() {
        System.out.println("Carro: " + modelo + " | Placa: " + placa);
        System.out.println("----------------------");
    }
}
    class Moto implements Veiculo {
    private String placa;
    private String modelo;

    public Moto(String placa, String modelo) {
        this.placa = placa;
        this.modelo = modelo;
    }

    @Override
    public void ligarMotor() {
        System.out.println("A moto " + modelo + " está ligando o motor...");
    }

    @Override
    public void abastecer(double litros) {
        System.out.println("Abastecendo moto com " + litros + " litros");
    }

    @Override
    public double calcularConsumo(double distancia, double litros) {
        return distancia / litros * 1.1;
    }

    @Override
    public void exibirInfo() {
        System.out.println("Moto: " + modelo + " | Placa: " + placa);
        System.out.println("----------------------");
    }
}
    class Caminhao implements Veiculo {
    private String placa;
    private String modelo;

    public Caminhao(String placa, String modelo) {
        this.placa = placa;
        this.modelo = modelo;
    }

    @Override
    public void ligarMotor() {
        System.out.println("O caminhão " + modelo + " está ligando o motor...");
    }

    @Override
    public void abastecer(double litros) {
        System.out.println("Abastecendo caminhão com " + litros + " litros");
    }

    @Override
    public double calcularConsumo(double distancia, double litros) {
        return distancia / litros * 0.8;
    }

    @Override
    public void exibirInfo() {
        System.out.println("Caminhão: " + modelo + " | Placa: " + placa);
        System.out.println("----------------------");
    }
}