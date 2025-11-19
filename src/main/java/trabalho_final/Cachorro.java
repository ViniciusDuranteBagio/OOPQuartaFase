package trabalho_final;

import java.util.Arrays;
import java.util.List;

public class Cachorro extends Animal {
    private static final List<String> DOENCAS = Arrays.asList(
        "Cinomose", "Parvovirose", "Leptospirose", "Dermatite", "Otite"
    );

    public Cachorro(String nome, int idade, String raca) throws ValidacaoException {
        super(nome, idade, raca);
    }

    @Override
    public List<String> getDoencasComuns() {
        return DOENCAS;
    }

    @Override
    public String getTipoAnimal() {
        return "Cachorro";
    }
}