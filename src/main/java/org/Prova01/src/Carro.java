public class Carro {
    private String marca;
    private int ano;

    private String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    private int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void exibirDados(){
        System.out.println("Marca: " + getMarca() +
                            "\nAno: " + getAno());


    }

}
