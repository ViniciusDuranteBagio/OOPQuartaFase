package Prova;

public class Carro {
    private String marca;
    private int ano;

    public String getMarca() {
        return marca;
    }

    public int getAno() {
        return ano;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void exibirDados(){
        System.out.println("Marca: " + getMarca() + "\nAno: " + getAno());
    }
}
