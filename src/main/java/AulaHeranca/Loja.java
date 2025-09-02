package AulaHeranca;

public class Loja extends Empresa {

    String tipoDeProduto;

    public Loja (String nome, String cidade, String tipoDeProduto) {
        super(nome, cidade);
        this.tipoDeProduto = tipoDeProduto;
    }
        @Override
    public void exibirDados() {
        super.exibirDados();
            System.out.println("Tipo de produto: " + tipoDeProduto);
    }
}
