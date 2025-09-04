package Prova;

public class Animal {

    private String nome;
    private Integer idade;

    public Animal(String nome, Integer idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void fazerSom(String som){
        System.out.println("Animal " + getNome() + ", " + getIdade() + " anos, fez um " + som);
    }
}
