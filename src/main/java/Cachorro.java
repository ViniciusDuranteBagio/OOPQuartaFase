import java.util.Arrays;
import java.util.List;

public class Cachorro extends Animal implements Doencas {

    private static final List<String> DOENCAS = Arrays.asList(
            "Cinomose",
            "Parvovirose",
            "Leptospirose",
            "Otite",
            "Dermatite"
    );

    public Cachorro(String nome, String raca, int idade) {
        super(nome, raca, idade);
    }

    @Override
    public List<String> getDoencas() {
        return DOENCAS;
    }

    @Override
    public String getTipo() {
        return "Cachorro";
    }
}
