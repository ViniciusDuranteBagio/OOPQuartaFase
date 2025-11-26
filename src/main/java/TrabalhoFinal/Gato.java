package TrabalhoFinal;

import java.util.List;

public class Gato extends Animal {

    public Gato(String nome, int idade, String raca) {
        super(nome, idade, raca);
    }

    @Override
    public List<String> getDoencacomuns() {
        return criarDoenca(
                "PIF",
                "Rinotraqueíte",
                "Calicivirose",
                "Panleucopenia",
                "Otite"
        );
    }
}
