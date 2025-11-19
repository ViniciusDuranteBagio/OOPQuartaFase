public abstract class Animal {

    private String nome;
    private int idade;
    private String raca;

    public Animal(String nome, int idade, String raca) {
        this.nome = nome;
        this.idade = idade;
        this.raca = raca;
    }

    public abstract String[] getDoencas(); // polimorfismo

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getRaca() {
        return raca;
    }

    @Override
    public String toString() {
        return nome + " - " + idade + " anos - Raça: " + raca;
    }
}

