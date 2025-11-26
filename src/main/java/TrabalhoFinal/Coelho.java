package TrabalhoFinal;

import java.util.List;

public class Coelho extends Animal {

    public Coelho(String nome, int idade, String raca) {
        super(nome, idade, raca);
    }

    @Override
    public List<String> getDoencacomuns() {
        return criarDoenca(
                "Mixomatose",
                "Pasteurelose",
                "Sarna Auricular",
                "Pododermatite",
                "Coccidiose"
        );
    }
}
