package Prova;

class Cachorro extends AnimalDois {
    public Cachorro(String nome) {
        super(nome);
    }

    @Override
    public void fazerSom() {
        System.out.println(nome + " diz: Au Au!");
    }
}
