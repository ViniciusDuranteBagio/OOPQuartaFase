public class Eletronico extends  ProdutoHeranca{
    int garantiaEmMeses;
    public Eletronico(String nome, double preco, int garantiaEmMeses){
        super(nome, preco);
        this.garantiaEmMeses=garantiaEmMeses;
    }
    @Override
    public void exibirDetalhes(){
        super.exibirDetalhes();
        System.out.println("Garantia em meses: "+garantiaEmMeses);
    }
}
