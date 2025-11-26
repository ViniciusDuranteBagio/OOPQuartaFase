package trabalhofinal;

import java.util.List;

public class Cachorro extends Animal{
    public Cachorro(String nome, int idade, String raca ) {
        super(nome, idade, raca);

    }


    @Override
    public List<String> getDoencaComum() {
        return criarListaDoenca("Cinomose", "Parvovirose", "Leptospirose", "Dermatite", "Otite");
    }

}
