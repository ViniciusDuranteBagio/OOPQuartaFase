package Aula5;

abstract class Veiculo {
    protected String placa;
    protected String modelo;
    public Veiculo(String placa, String modelo){
        this.placa=placa;
        this.modelo=modelo;
    }
    public void ligarMotor(){
        System.out.println("Motor do "+modelo+" ligado");
    }
    public void abastecer(){
        System.out.println(modelo+" abastecido");
    }
    public abstract double calcularConsumo(double distancia);
}
