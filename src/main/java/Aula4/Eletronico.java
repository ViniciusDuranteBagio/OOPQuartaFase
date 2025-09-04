package Aula4;

public class Eletronico extends Produto{
    int garantiaEmMeses;

    public Eletronico(String nome, double preco, int garantiaEmMeses) {
        super(nome, preco);
        this.garantiaEmMeses = garantiaEmMeses;
    }

    public void exibirDetalhes () {
        super.exibirDetalhes();
        System.out.println("Garantia: " + garantiaEmMeses + " meses.");
    }
}
