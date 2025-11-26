
public class Cachorro extends Animal {


    private static final String[] DOENCAS_COMUNS = {
            "Cinomose", "Parvovirose", "Leptospirose", "Dermatite", "Otite"
    };

    public Cachorro(String nome, int idade, String raca) {
        super(nome, idade, raca);
    }

    @Override
    public String[] getDoencasComuns() {
        return DOENCAS_COMUNS;
    }
}