/**
 * Classe abstrata que serve como base para todos os tipos de animais.
 * Requisito: Classes, Encapsulamento, Herança (Base).
 */
public abstract class Animal {
    private String nome;
    private int idade;
    private String raca;

    // Construtor
    public Animal(String nome, int idade, String raca) {
        this.nome = nome;
        this.idade = idade;
        this.raca = raca;
    }


    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getRaca() {
        return raca;
    }


    public abstract String[] getDoencasComuns();

    @Override
    public String toString() {

        return "Tipo: " + this.getClass().getSimpleName() +
                ", Nome: " + nome +
                ", Idade: " + idade +
                ", Raça: " + raca;
    }
}