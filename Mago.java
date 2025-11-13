package Aula4;

public class Mago extends Personagem {
    private int mana;
    
    // Construtor
    public Mago(String nome, int nivel, int mana) {
        super(nome, nivel);
        this.mana = mana;
    }
    
    // Getter e Setter
    public int getMana() {
        return mana;
    }
    
    public void setMana(int mana) {
        this.mana = mana;
    }
    
    // Sobrescrevendo o método da superclasse
    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Mana: " + this.mana);
    }
} 