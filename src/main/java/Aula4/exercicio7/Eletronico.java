package Aula4.exercicio7;

public class Eletronico extends Produto {
    public int garantiaEmMeses;

    public Eletronico(String nome, double preco, int garantiaEmMeses) {
        super(nome, preco);
        this.garantiaEmMeses = garantiaEmMeses;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Garantia: " + garantiaEmMeses + " meses");
    }
}
