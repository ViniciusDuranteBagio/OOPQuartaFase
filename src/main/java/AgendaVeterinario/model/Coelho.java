package AgendaVeterinario.model;

import java.util.ArrayList;
import java.util.List;

public class Coelho extends Animal {

    public Coelho(String nome, int idade, String raca) {
        super(nome, idade, raca);
    }

    @Override
    public List<String> getDoencas() {
        List<String> listDoencasCoelho = new ArrayList<>();
        listDoencasCoelho.add("Mixomatose");
        listDoencasCoelho.add("Pasteurelose");
        listDoencasCoelho.add("Sarna Auricular");
        listDoencasCoelho.add("Pododermatite");
        listDoencasCoelho.add("Coccidiose");

        return listDoencasCoelho;
    }
}
