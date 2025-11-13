package Aula4;

public class Loja extends Empresa {
    private String tipoDeProduto;
    
    // Construtor com super()
    public Loja(String nome, String cidade, String tipoDeProduto) {
        super(nome, cidade);
        this.tipoDeProduto = tipoDeProduto;
    }
    
    // Getter e Setter
    public String getTipoDeProduto() {
        return tipoDeProduto;
    }
    
    public void setTipoDeProduto(String tipoDeProduto) {
        this.tipoDeProduto = tipoDeProduto;
    }
    
    // Sobrescrevendo o método da superclasse
    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Tipo de Produto: " + this.tipoDeProduto);
    }
} 