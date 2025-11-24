package animal;

import java.util.Arrays;
import java.util.List;

public class Gato extends Animal {

    private static final List<String> DOENCAS = Arrays.asList(
            "PIF", "Rinotraqueíte", "Calicivirose", "Panleucopenia", "Otite"
    );

    public Gato(String nome, int idade, String raca) {
        super(nome, idade, raca);
    }

    @Override
    public boolean possuiDoenca(String doenca) {
        return DOENCAS.stream().anyMatch(d -> d.equalsIgnoreCase(doenca));
    }
}
