package Aula4;

public class Moto extends Veiculo{
    int cilindrada;

    public Moto(String marca, String modelo, int cilindrada) {
        super(marca, modelo);
        this.cilindrada = cilindrada;
    }

    public void imprimeDadosVeiculo() {
        super.exibeInfo();
        System.out.println("Quantidade de Cilindradas: " + cilindrada);
    }
}
