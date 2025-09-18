package Aula4.Exercicios;

public class Veiculo {
    public String marca;
    public String modelo;

    public Veiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public void exibirDetalhes() {
        System.out.println("Marca: " + marca + " | Modelo: " + modelo);
    }
}