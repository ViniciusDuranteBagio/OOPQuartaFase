package exercicio4_e_5;

public class Animal {
    //public String nome;
    //public int idade;
    // Declarações do exercício 4

    protected String nome;
    protected int idade;
    // Declarações do exercício 5

    public Animal(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public void dormir() {
        System.out.println("O animal está dormindo");
    }

    public void exibirInformacoes() {
        System.out.println("Nome = " + nome + "\nIdade = " + idade);
    }
}
