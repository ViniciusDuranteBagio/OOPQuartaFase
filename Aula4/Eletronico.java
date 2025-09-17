package Aula4;

public class Eletronico extends Produto{
    private int garantiaEmMeses;

    public Eletronico(){
        super();
    }

    public Eletronico(String nome, double preco, int garantiaEmMeses){
        super(nome, preco);
        this.garantiaEmMeses = garantiaEmMeses;
    }

    public int getGarantiaEmMeses() {
        return garantiaEmMeses;
    }
    public void setGarantiaEmMeses(int garantiaEmMeses) {
        this.garantiaEmMeses = garantiaEmMeses;
    }

    @Override
    public void exibirDetalhes(){
        super.exibirDetalhes();
        System.out.println("Garantia de " + this.garantiaEmMeses + " meses");
    }
}
