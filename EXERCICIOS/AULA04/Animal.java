public class Animal {
    protected String nome;
    protected int idade;

    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void dormir() {
        System.out.println("O animal está dormindo");
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome + " | Idade: " + idade);
    }
}
