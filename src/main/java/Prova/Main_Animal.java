package Prova;

public class Main_Animal {
    public static void main(String[] args) {

        Animal animal = new Animal();

        animal.nome = "Thor";
        animal.idade = 19;
        animal.exibir();
        animal.fazersom();

        Cachorro dog = new Cachorro();
        dog.nome="teste";
        dog.idade=19;
        dog.Fazersom();
        dog.exibir();

        Gato cat = new Gato();
        cat.idade=20;
        cat.nome="cat";
        cat.Fazersom();
        cat.exibir();

    }
}