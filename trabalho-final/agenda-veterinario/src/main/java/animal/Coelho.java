package animal;

import java.util.Arrays;
import java.util.List;

public class Coelho extends Animal {

    private static final List<String> DOENCAS = Arrays.asList(
            "Mixomatose", "Pasteurelose", "Sarna Auricular", "Pododermatite", "Coccidiose"
    );

    public Coelho(String nome, int idade, String raca) {
        super(nome, idade, raca);
    }

    @Override
    public boolean possuiDoenca(String doenca) {
        return DOENCAS.stream().anyMatch(d -> d.equalsIgnoreCase(doenca));
    }
}
