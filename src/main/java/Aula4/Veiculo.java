package Aula4;

//classe veiculo
public class Veiculo{

    //atributos da classe
    private String marca;
    private String modelo;

    //construtor
    public Veiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    //metodos getter para puxar dados na main
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }
}
