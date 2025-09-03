/* Crie uma classe Animal com os atributos nome e idade, e um método fazerSom(). Na classe main, crie um objeto Animal e chame o método para fazer som, mostrando o nome a idade do animal, a frase "fez algum som".
*/

class Animal {
    String nome;
    int idade;

    void fazerSom() {
        System.out.println(nome + ", de " + idade + " anos, fez algum som.");
    }
}
public class Main {
    public static void main(String[] args) {
        Animal meuAnimal = new Animal();
        meuAnimal.nome = "Rex";
        meuAnimal.idade = 5;  
        meuAnimal.fazerSom();
    }
}