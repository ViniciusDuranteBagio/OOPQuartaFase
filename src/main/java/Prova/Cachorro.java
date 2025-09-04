package Prova;

public class Cachorro extends Animal {
    String cachorro = "latir";
    @Override
    public void fazerBarulho()
        {
        System.out.println("O cachorro fez um som: " + cachorro);
    }
}
