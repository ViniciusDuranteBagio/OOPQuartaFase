package Animal;

public class Animal {
    protected String nome;
    protected int idade;
    protected String som = "Fez algum som.";

    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    protected String getNome() {
        return nome;
    }

    protected int getIdade() {
        return idade;
    }

    protected String getSom() {
        return som;
    }

    protected void setSom(String som) {
        this.som = som;
    }

    public void fazerSom(){
        System.out.println("Animal: " + getNome() +
                "\nIdade: " + getIdade());
        System.out.println(getSom());
    }
}
