package Atividades.Aula4;

public class Carro extends Veiculo {
    protected int quantidadeDePortas;

    Carro(String marca, String modelo, int quantidadeDePortas) {
        super(marca, modelo);
        this.quantidadeDePortas = quantidadeDePortas;
    }
}
