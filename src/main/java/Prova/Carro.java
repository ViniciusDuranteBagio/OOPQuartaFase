package Prova;

public class Carro {
    private String marca;
    private int ano;

    public Carro(String marca,int ano){
        this.marca=marca;
        this.ano=ano;
    }

    public int getAno() {
        return ano;
    }

    public String getMarca() {
        return marca;
    }


    public void ExibirDados(){
        System.out.println("=== Informações do Carro ===");
        System.out.println("Ano: " + this.ano);
        System.out.println("Marca: " + this.marca);
        System.out.println("================================");
    }
}
