package Aula4;

public class Cachorro extends Animal {
    
    // Construtor
    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }
    
    // Método latir
    public void latir() {
        System.out.println("O cachorro está latindo");
    }
    
    // Método brincar
    public void brincar() {
        System.out.println("O cachorro " + this.nome + " está brincando!");
    }
} 