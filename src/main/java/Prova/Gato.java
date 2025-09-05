package Prova;
    public class Gato extends Animal{

    public Gato(String nome, Integer idade) {
        super(nome, idade);
    }
    public void fazerSom() {
        System.out.println("Meu gato " + getNome() + ", tem " + getIdade() + " anos e miou");
        }
    }