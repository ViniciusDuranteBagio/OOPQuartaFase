package TrabalhoFinal;

import TrabalhoFinal.Animal;
import TrabalhoFinal.ValidacaoException;

import java.util.Arrays;
import java.util.List;

public class Gato extends Animal {
    private static final List<String> DOENCAS = Arrays.asList(
            "PIF", "Rinotraqueíte", "Calicivirose", "Panleucopenia", "Otite"
    );

    public Gato(String nome, int idade, String raca) throws ValidacaoException {
        super(nome, idade, raca);
    }

    @Override
    public List<String> getDoencasPossiveis() {
        return DOENCAS;
    }
}