package Prova;

public class Carro {
    String marca;
    int ano;

    public Carro(String marca, int ano) {
        this.marca = marca;
        this.ano = ano;
    }

    public void exibirDados() {
        System.out.println("Carro: " + marca + "\nAno: " + ano);
    }
}

