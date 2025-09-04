package Prova;

public class Carro {

    private String marca;
    private int ano;

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    void exibirResultado() {
        System.out.println("A marca do seu carro é: " + marca + " do ano de: " + ano);
    }
}
