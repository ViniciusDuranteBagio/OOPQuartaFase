package TrabalhoFinal;

public class Cachorro extends Animal {
    public Cachorro(String nome, int idade, String raca) {
        super(nome, idade, raca);
    }

    public String[] getDoencas() {
        return new String[] {"Cinomose", "Parvovirose", "Leptospirose", "Dermatite", "Otite"};
    }
}