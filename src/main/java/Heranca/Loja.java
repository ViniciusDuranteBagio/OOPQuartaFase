package Heranca;

public class Loja extends Empresa {
    private String tipoDeProduto;

    public Loja(String nome, String cidade, String tipoDeProduto) {
        super(nome, cidade);
        this.tipoDeProduto = tipoDeProduto;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Tipo de Produto: " + tipoDeProduto);
    }
}