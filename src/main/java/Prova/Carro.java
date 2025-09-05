package Prova;

public class Carro {

    private String marca;
    private int ano;

    public Carro(String marcaInical, int anoinIcial){
        this.marca =marcaInical;
        this.ano = anoinIcial;
    }

    public void exibirDados(){
        System.out.println("O carro é da marca: "+marca+"\nO carro é do ano:"+ano);
    }

    public int getAno() {
        return ano;
    }

    public String getMarca() {
        return marca;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
