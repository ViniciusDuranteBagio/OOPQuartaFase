package Prova;

public class Carro {
    //Questão01
    private String marca;
    private int ano;

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void exibirDados() {
        System.out.println("Marca: " + marca);
        System.out.println("Ano: " + ano);
    }
}