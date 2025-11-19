public abstract class Animal {
    private String nome;
    private int idade;
    private String raca;

    public Animal(String nome, int idade, String raca) {
        this.nome = nome;
        this.idade = idade;
        this.raca = raca;
    }

    public String getNome() { return nome; }
    public int getIdade() { return idade; }
    public String getRaca() { return raca; }

    public void setNome(String nome) { this.nome = nome; }
    public void setIdade(int idade) { this.idade = idade; }
    public void setRaca(String raca) { this.raca = raca; }

    public abstract String[] getDoencasComuns();

    @Override
    public String toString() {
        return String.format("%s (%s, %d anos)", nome, raca, idade);
    }
}