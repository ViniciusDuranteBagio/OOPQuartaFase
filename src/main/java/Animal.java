public abstract class Animal {

    private String nome;
    private String raca;
    private int idade;

    public Animal(String nome, String raca, int idade) {
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    @SuppressWarnings("unused")
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    @SuppressWarnings("unused")
    public void setRaca(String raca) {
        this.raca = raca;
    }

    public int getIdade() {
        return idade;
    }

    @SuppressWarnings("unused")
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getTipo() {
        return "Animal";
    }
}
