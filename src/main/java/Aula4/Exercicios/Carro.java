package Aula4.Exercicios;

public class Carro extends Veiculo {
    private int quantidadeDePortas;

    public Carro(String marca, String modelo, int quantidadeDePortas) {
        super(marca, modelo);
            this.quantidadeDePortas = quantidadeDePortas;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
         System.out.println("Portas: " + quantidadeDePortas);
    }
}
