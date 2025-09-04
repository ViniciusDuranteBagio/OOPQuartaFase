package Animal;

public class Cachorro extends Animal {

    public Cachorro(String nome, int idade){
        super(nome, idade);
    }
    @Override
    public void fazerSom() {
        super.setSom("Latiu");
        super.fazerSom();

    }
}
