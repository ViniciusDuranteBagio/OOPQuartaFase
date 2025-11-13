package Aula4;

public class Carro extends Veiculo {
    private int quantidadeDePortas;
    
    // Construtor
    public Carro(String marca, String modelo, int quantidadeDePortas) {
        super(marca, modelo);
        this.quantidadeDePortas = quantidadeDePortas;
    }
    
    // Getter e Setter
    public int getQuantidadeDePortas() {
        return quantidadeDePortas;
    }
    
    public void setQuantidadeDePortas(int quantidadeDePortas) {
        this.quantidadeDePortas = quantidadeDePortas;
    }
    
    // Sobrescrevendo o método da superclasse
    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Quantidade de Portas: " + this.quantidadeDePortas);
    }
} 