package Aula04;

public class Cachorro extends Animal {

    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }

    public void imprimirInfoCachorro() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }

    public void latir() {
        System.out.println("O cachorro esta latindo");
    }
    public void brincar() {
        System.out.println("O cachorro " + nome + " esta brincando");
    }
}
