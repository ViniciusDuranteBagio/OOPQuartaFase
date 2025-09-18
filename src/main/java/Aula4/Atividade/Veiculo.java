package Aula4.Atividade;

public class Veiculo {
    private String marca;
    private String modelo;

    public Veiculo(String marca, String modelo){
        this.marca=marca;
        this.modelo=modelo;
    }


    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void exibirDetalhes() {
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
    }

}
