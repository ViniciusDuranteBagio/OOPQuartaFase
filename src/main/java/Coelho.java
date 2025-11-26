import java.util.Arrays;
import java.util.List;

public class Coelho extends Animal implements Doencas {

    private static final List<String> DOENCAS = Arrays.asList(
            "Mixomatose",
            "Pasteurelose",
            "Sarna Auricular",
            "Pododermatite",
            "Coccidiose"
    );

    public Coelho(String nome, String raca, int idade) {
        super(nome, raca, idade);
    }

    @Override
    public List<String> getDoencas() {
        return DOENCAS;
    }

    @Override
    public String getTipo() {
        return "Coelho";
    }
}
