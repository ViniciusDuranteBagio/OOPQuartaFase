package Aula4.Exercicios;

public class Loja extends Empresa {
    private String tipoDeProduto;

    public Loja(String nome, String cidade, String tipoDeProduto) {
        super(nome, cidade);
        this.tipoDeProduto = tipoDeProduto;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Tipo de Produto: " + tipoDeProduto);
    }
}