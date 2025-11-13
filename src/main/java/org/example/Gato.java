package org.example;

import java.util.List;

public class Gato extends Animal {

    public Gato(String nome, int idade, String raca) throws ValidacaoException {
        super(nome, idade, raca);
    }

    @Override
    public List<String> getDoencasComuns() {
        return List.of("PIF", "Rinotraqueíte", "Calicivirose", "Panleucopenia", "Otite");
    }

}
