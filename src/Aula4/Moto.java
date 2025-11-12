package Aula4;

public class Moto extends Veiculo {
    private int cilindrada;
    
    // Construtor
    public Moto(String marca, String modelo, int cilindrada) {
        super(marca, modelo);
        this.cilindrada = cilindrada;
    }
    
    // Getter e Setter
    public int getCilindrada() {
        return cilindrada;
    }
    
    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }
    
    // Sobrescrevendo o método da superclasse
    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Cilindrada: " + this.cilindrada + "cc");
    }
} 