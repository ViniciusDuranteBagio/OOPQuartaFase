package Prova;

public class Cachorro extends Animal {
    //cachorro chato latindo - Questão 7
    
    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void fazerSom() {
        System.out.println(nomeAnimal + " de " + idadeAnimal + " anos latiu: AUAU! (chato demais fica quieto dogMau!)");
    }
    
}
