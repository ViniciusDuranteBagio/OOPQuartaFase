package Prova;

public class Gato extends Animal {

    @Override
    public void fazerSom() {

        System.out.println(getNome("mimi") + " (" + getIdade(10) + " anos) está miando: Miau!");
    }

}
