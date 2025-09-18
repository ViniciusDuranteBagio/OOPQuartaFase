package ExerciciosAula4;

// Usada nos exercícios 4 e 5
public class Cachorro extends Animal {
    public void latir() {
        System.out.println("O cachorro está latindo: Au au!");
    }

    // Método para o Exercício 5
    public void brincar() {
        // Acessa o atributo 'nome' herdado e protegido da classe Animal
        System.out.println("O cachorro " + this.nome + " está brincando!");
    }
}