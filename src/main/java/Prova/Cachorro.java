package Prova;

public class Cachorro extends Animal{

    public Cachorro(String nome, int idade){
        super(nome, idade);
    }

    @Override
    public void fazerSom() {

        System.out.println(getNome() + "auau");
    }
}
//Cachorro dog = new Cachorro("leviatan ", 5);
//        Cat cat = new Cat("maki ", 2);
//dog.fazerSom();
//cat.fazerSom();
//    }
//}