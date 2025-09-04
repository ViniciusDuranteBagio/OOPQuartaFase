package Prova;

public class Carro {

    private String marca;
    private Integer ano;

    public Carro(String marca, Integer ano) {
        this.marca = marca;
        this.ano = ano;
    }

    public String getMarca() {
        return marca;
    }

    public Integer getAno() {
        return ano;
    }

    public void exibirDados(){
        System.out.println("Marca = " + getMarca() + "\nAno = " + getAno());
    }
}
