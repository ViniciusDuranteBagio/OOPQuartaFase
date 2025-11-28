package AgendaVeterinario.model;

import java.util.ArrayList;
import java.util.List;

public class Cachorro extends Animal{
    public Cachorro(String nome, int idade, String raca) throws RuntimeException {
        super(nome, idade, raca);
    }

    @Override
    public List<String> getDoencas() {
        List<String> listDoencasCachorro = new ArrayList<>();

        listDoencasCachorro.add("Cinomose");
        listDoencasCachorro.add("Parvovirose");
        listDoencasCachorro.add("Leptospirose");
        listDoencasCachorro.add("Dermatite");
        listDoencasCachorro.add("Otite");

        return listDoencasCachorro;
    }


}