package Aula5Atividades;

public abstract class Veiculos {
    protected String placa;
    protected String modelo;

    public Veiculos(String placa, String modelo) {
        this.placa = placa;
        this.modelo = modelo;
    }
    public void ligarMotor(){
        System.out.println(modelo + " (placa: " + placa + " ) está ligando o motor");
    }
    public void abasteca(){
        System.out.println(modelo + "(placa: " + placa + ") está abastecendo");
    }
    public abstract double calcularConsumo();


}
