package TrabalhoFinal;

import java.util.List;

public class Cachorro extends Animal {

    public Cachorro(String nome, int idade, String raca) {
        super(nome, idade, raca);
    }

    @Override
    public List<String> getDoencacomuns() {
        return criarDoenca(
                "Cinomose",
                "Parvovirose",
                "Leptospirose",
                "Dermatite",
                "Otite"
        );
    }
}
