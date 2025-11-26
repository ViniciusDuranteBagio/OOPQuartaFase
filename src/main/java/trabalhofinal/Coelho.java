package trabalhofinal;

import java.util.ArrayList;
import java.util.List;

public class Coelho extends Animal{
    public Coelho(String nome,  int idade, String raca) {
        super(nome, idade, raca);
    }

    @Override
    public List<String> getDoencaComum() {
        return super.criarListaDoenca( "Mixomatose", "Pasteurelose", "Sarna Auricular",
                "Pododermatite", "Coccidiose");
    }
}
