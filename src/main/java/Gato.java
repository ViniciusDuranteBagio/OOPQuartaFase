import java.util.Arrays;
import java.util.List;

public class Gato extends Animal implements Doencas {

    private static final List<String> DOENCAS = Arrays.asList(
            "PIF (Peritonite Infecciosa Felina)",
            "Rinotraqueíte",
            "Calicivirose",
            "Panleucopenia",
            "Otite"
    );

    public Gato(String nome, String raca, int idade) {
        super(nome, raca, idade);
    }

    @Override
    public List<String> getDoencas() {
        return DOENCAS;
    }

    @Override
    public String getTipo() {
        return "Gato";
    }
}
