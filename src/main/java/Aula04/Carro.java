package Aula04;

public class Carro extends Veiculo {
    protected int quantidadeDePortas;

    public Carro(String marca, String modelo, int quantidadeDePortas) {
        super(marca, modelo);
        this.quantidadeDePortas = quantidadeDePortas;
    }
    public void imprimirInfoCarro() {
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Quantidade de portas: " + this.quantidadeDePortas);
    }
}
