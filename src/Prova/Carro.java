package Prova;

public class Carro{
    private String marca;
    private int ano;

    // Construtor
    public Carro(String marca, int ano){
        this.marca = marca;
        this.ano   = ano;
    }

    public void ExibirDados(){
        System.out.println("O carro é da marca " + marca + " e do ano " + ano);
    }
}
