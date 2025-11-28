package entities;

public class Cachorro extends Animal {

    public Cachorro(String nome, int idade, String raca) {
        super(nome, idade, raca);
    }

    @Override
    public String doenca() {
        return "Doenças comuns: Cinomose, Parvovirose, Leptospirose, Dermatite, Otite";
    }
}