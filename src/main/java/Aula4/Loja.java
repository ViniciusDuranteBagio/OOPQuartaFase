package Aula4;

public class Loja extends Empresa {
    private String tipoDeProduto;
    
    public Loja(String nome, String cidade, String tipoDeProduto) {
        super(nome, cidade);
        this.tipoDeProduto = tipoDeProduto;
    }
    
    public String getTipoDeProduto() {
        return tipoDeProduto;
    }
    
    public void setTipoDeProduto(String tipoDeProduto) {
        this.tipoDeProduto = tipoDeProduto;
    }
    
    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Tipo de Produto: " + this.tipoDeProduto);
    }
} 