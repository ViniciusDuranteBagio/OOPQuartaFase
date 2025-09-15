package Aula4;

public class Loja extends Empresa{
    private String tipoDeProduto;

    public Loja(String nome, String cidade, String tipoDeProduto) {
        super(nome, cidade);
        this.tipoDeProduto = tipoDeProduto;
    }

    public String getTipoDeProduto() {
        return tipoDeProduto;
    }

    @Override
    public void exibir(){
        super.exibir();
        System.out.println("Tipo de Produto: " + getTipoDeProduto() );
    }
}
