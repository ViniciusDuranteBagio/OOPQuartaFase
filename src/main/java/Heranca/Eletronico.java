package Heranca;

public class Eletronico extends Produto {
    private int garantiaEmMeses;

    public Eletronico(String nome, double preco, int garantiaEmMeses) {
        super(nome, preco);
        this.garantiaEmMeses = garantiaEmMeses;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Garantia: " + garantiaEmMeses + " meses");
    }
}
