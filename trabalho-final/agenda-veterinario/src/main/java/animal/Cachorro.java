package animal;

import java.util.Arrays;
import java.util.List;

public class Cachorro extends Animal {

    private static final List<String> DOENCAS = Arrays.asList(
            "Cinomose", "Parvovirose", "Leptospirose", "Dermatite", "Otite"
    );

    public Cachorro(String nome, int idade, String raca) {
        super(nome, idade, raca);
    }

    @Override
    public boolean possuiDoenca(String doenca) {
        return DOENCAS.stream().anyMatch(d -> d.equalsIgnoreCase(doenca));
    }
}
