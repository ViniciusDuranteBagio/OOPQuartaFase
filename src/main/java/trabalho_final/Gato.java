package trabalho_final;

import java.util.Arrays;
import java.util.List;

public class Gato extends Animal {
    private static final List<String> DOENCAS = Arrays.asList(
        "PIF (Peritonite Infecciosa Felina)", "Rinotraqueíte", "Calicivirose",
        "Panleucopenia", "Otite"
    );

    public Gato(String nome, int idade, String raca) throws ValidacaoException {
        super(nome, idade, raca);
    }

    @Override
    public List<String> getDoencasComuns() {
        return DOENCAS;
    }

    @Override
    public String getTipoAnimal() {
        return "Gato";
    }
}