package Animal;

public class Cachorro extends Animal {

    // Lista de doenças mais comuns em cães
    private static final String[] DOENCAS = {
            "Cinomose", "Parvovirose", "Leptospirose", "Dermatite", "Otite"
    };

    public Cachorro(String nome, int idade, String raca) {
        super(nome, idade, raca);
    }

    @Override
    public String[] getDoencasPossiveis() {
        return DOENCAS;
    }

    @Override
    public String toString() {
        return "Cachorro - " + super.toString();
    }
}
