package Prova;

public class Cachorro extends Animal {
    @Override
    public void fazerSom(){
        System.out.println("Cachorro " + nome + " latiu AU AU e " + "tem " + idade + " anos");
    }
}
