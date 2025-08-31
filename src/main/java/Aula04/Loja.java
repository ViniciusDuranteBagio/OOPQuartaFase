package Aula04;

public class Loja extends Empresa {
    protected String tipoDeProduto;

    public Loja(String nome, String cidade, String tipoDeProduto) {
        super(nome, cidade);
        this.tipoDeProduto = tipoDeProduto;
    }

    @Override
    public void imprimirInfoEmpresa() {
        super.imprimirInfoEmpresa();
        System.out.println("Tipo de produto: " + this.tipoDeProduto);
    }
}
