package Aula5;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Thor", true, false);
        Cachorro cachorro2 = new Cachorro("bolinha", true, false);
        Cachorro cachorro3 = new Cachorro("minhoca", false, false);
        Gato gato = new Gato("flash", true, true);
        Gato gato2 = new Gato("flashzinho", true, true);
        Gato gato3 = new Gato("kira", true, true);

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(cachorro);
        animals.add(cachorro2);
        animals.add(cachorro3);
        animals.add(gato);
        animals.add(gato2);
        animals.add(gato3);

        Veterinario v = new Veterinario();
        for (Animal animal : animals) {
            v.cuidarDoBichinho(animal);
        }
    }
}
