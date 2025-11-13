package Aula4;

public class Eletronico extends Produto {
    private int garantiaEmMeses;
    
    // Construtor
    public Eletronico(String nome, double preco, int garantiaEmMeses) {
        super(nome, preco);
        this.garantiaEmMeses = garantiaEmMeses;
    }
    
    // Getter e Setter
    public int getGarantiaEmMeses() {
        return garantiaEmMeses;
    }
    
    public void setGarantiaEmMeses(int garantiaEmMeses) {
        this.garantiaEmMeses = garantiaEmMeses;
    }
    
    // Sobrescrevendo o método da superclasse usando super
    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Garantia: " + this.garantiaEmMeses + " meses");
    }
} 