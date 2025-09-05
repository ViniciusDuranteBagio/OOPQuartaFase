package Prova;

public class Carro {
    private String marca;
    private int ano;

    public Carro(String marca, int ano){
        this.marca = marca;
        this.ano = ano;
    }

    public void exibirDados(){
        System.out.println("Marca: " + marca + "\nAno: " + ano);
    }
}
