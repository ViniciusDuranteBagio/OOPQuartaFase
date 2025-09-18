package Aula4.Atividade;

public class Carro extends Veiculo{
    private int quantidadeDePorta;


    public Carro(String marca, String modelo,int quantidadeDePorta) {
        super(marca, modelo);
        this.quantidadeDePorta=quantidadeDePorta;

    }

    public int getQuantidadeDePorta() {
        return quantidadeDePorta;
    }

    public void setQuantidadeDePorta(int quantidadeDePorta) {
        this.quantidadeDePorta = quantidadeDePorta;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Quantidade de Portas: " + this.quantidadeDePorta);
    }
}
