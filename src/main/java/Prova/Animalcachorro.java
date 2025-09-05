package Prova;

public class Animalcachorro {
    String nome;
    int idade;

    public void fazerSom() {
        System.out.println(nome + ", " + idade + " anos, fez algum som.");
    }
}


public class Cachorro extends Animal {
    @Override
    public void fazerSom() {
        System.out.println(nome + ", " + idade + " anos, latiu: Au Au!");
    }
}


public class Gato extends Animal {
    @Override
    public void fazerSom() {
        System.out.println(nome + ", " + idade + " anos, miou: Miau!");
    }
}
}
