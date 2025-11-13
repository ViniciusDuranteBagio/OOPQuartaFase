package org.example;

import java.util.List;

public class Coelho extends Animal {

    public Coelho(String nome, int idade, String raca) throws ValidacaoException {
        super(nome, idade, raca);
    }

    @Override
    public List<String> getDoencasComuns() {
        return List.of("Mixomatose", "Pasteurelose", "Sarna Auricular", "Pododermatite", "Coccidiose");
    }

}
