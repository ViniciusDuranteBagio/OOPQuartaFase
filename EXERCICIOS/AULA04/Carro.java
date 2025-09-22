public class Carro extends Veiculo {
    private int quantidadeDePortas;

    public Carro(String marca, String modelo, int quantidadeDePortas) {
        super(marca, modelo);
        this.quantidadeDePortas = quantidadeDePortas;
    }

    public int getQuantidadeDePortas() {
        return quantidadeDePortas;
    }
}
