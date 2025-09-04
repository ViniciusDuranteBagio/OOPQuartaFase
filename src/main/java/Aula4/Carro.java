package Aula4;

public class Carro extends Veiculo{
    int quantidadeDePortas;

    public Carro(String marca, String modelo, int quantidadeDePortas) {
        super(marca, modelo);
        this.quantidadeDePortas = quantidadeDePortas;
    }

    public void imprimeDadosVeiculo() {
        super.exibeInfo();
        System.out.println("Quantidade de Portas: " + quantidadeDePortas);
    }
}
