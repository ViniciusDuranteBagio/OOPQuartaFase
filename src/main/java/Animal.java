public abstract class Animal {

    private String nome;
    private int idade;
    private String raca;

    public Animal(String nome, int idade, String raca) {

        this.nome = nome;
        this.idade = idade;
        this.raca = raca;
    }

    public abstract String escolherDoenca();

    @Override
    public String toString() {
        return "Nome: " + nome + " | Idade: " + idade + " | Raca: " + raca;
    }

}
