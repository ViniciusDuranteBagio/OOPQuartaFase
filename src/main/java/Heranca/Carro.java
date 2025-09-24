package Heranca;

public class Carro extends Veiculo {
    private int quantidadeDePortas;

    public Carro(String marca, String modelo, int quantidadeDePortas) {
        super(marca, modelo);
        this.quantidadeDePortas = quantidadeDePortas;
    }

    public int getQuantidadeDePortas() {
        return quantidadeDePortas;
    }

    public void setQuantidadeDePortas(int quantidadeDePortas) {
        this.quantidadeDePortas = quantidadeDePortas;
    }

    @Override
    public String toString() {
        return "Carro [marca=" + getMarca() + ", modelo=" + getModelo() + ", quantidadeDePortas=" + quantidadeDePortas + "]";
    }
}
