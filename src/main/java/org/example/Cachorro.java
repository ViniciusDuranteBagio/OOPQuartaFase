package org.example;

import java.util.List;

public class Cachorro extends Animal {

    public Cachorro(String nome, int idade, String raca) throws ValidacaoException {
        super(nome, idade, raca);
    }

    @Override
    public List<String> getDoencasComuns() {
        return List.of("Cinomose", "Parvovirose", "Leptospirose", "Dermatite", "Otite");
    }

}

