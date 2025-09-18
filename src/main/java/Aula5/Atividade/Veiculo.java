package Aula5.Atividade;

public abstract class Veiculo implements IVeiculo {
    protected String placa;
    protected String modelo;
    protected double tanque;
    private double distancia;

    public Veiculo(String modelo,String placa){
        this.modelo=modelo;
        this.placa=placa;
        this.tanque=0.0;
        this.distancia=0.0;
    }

    public String getModelo() {
        return modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public double getTanque() {
        return tanque;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public void setTanque(double tanque) {
        this.tanque = tanque;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    @Override
    public void ligarMotor() {
        if (tanque > 0) {
            System.out.println(modelo + " (placa " + placa + ") ligou o motor!");
        } else {
            System.out.println(modelo + " (placa " + placa + ") não pode ligar: tanque vazio.");
        }
    }

    @Override
    public void abastecer(double litros) {
        tanque += litros;
        System.out.println(modelo + " abastecido com " + litros + " litros. Total: " + tanque + "L");
    }

    @Override
    public void exibirDados() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Placa: " + placa);
        System.out.println("Combustível no tanque: " + tanque + "L");
        System.out.println("---------------------------");


    }

    public abstract double calcularConsumo(double distancia);
}
