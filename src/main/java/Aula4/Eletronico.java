package Aula4;

//classe herda de produto
public class Eletronico extends Produto{

    //atributos da classe
    private int garantiaEmMeses;

    //construtor da classe
    public Eletronico(String nome, double preco, int garantiaEmMeses) {
        super(nome, preco);
        this.garantiaEmMeses = garantiaEmMeses;
    }

    //metodo getter
    public int getGarantiaEmMeses() {
        return garantiaEmMeses;
    }

    //sobrescrevendo o metodo
    @Override
    public void exibirDetalhes(){
        super.exibirDetalhes();
        System.out.println("A garantia é de " + getGarantiaEmMeses() + " meses.");
    }

}
