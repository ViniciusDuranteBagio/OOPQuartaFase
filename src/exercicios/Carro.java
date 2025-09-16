package exercicios;

class Carro extends Veiculo {
    int quantidadeDePortas;

    public Carro(String marca, String modelo, int quantidadeDePortas) {
        super(marca, modelo);
        this.quantidadeDePortas = quantidadeDePortas;
    }

    public void exibirDetalhes() {
        System.out.println("Carro: " + marca + " " + modelo + ", Portas: " + quantidadeDePortas);
    }
}
