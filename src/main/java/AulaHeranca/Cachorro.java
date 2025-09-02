package AulaHeranca;

public class Cachorro extends Animal {
    public Cachorro (String nome, int idade) {
        super(nome, idade);
    }
        public void latir() {
            System.out.println("O cachorro está latindo");
    }
        public void brincar() {
            System.out.println("O cachorro " + nome + " está brincando");
        }
}
