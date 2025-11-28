package AgendaVeterinario.model;

import java.util.ArrayList;
import java.util.List;

public class Gato extends Animal{

    public Gato(String nome, int idade, String raca) {
        super(nome, idade, raca);
    }

    @Override
    public List<String> getDoencas() {
        List<String> listDoencasGatos = new ArrayList<>();
        listDoencasGatos.add("PIF (Peritonite Infecciosa Felina)");
        listDoencasGatos.add("Rinotraqueíte");
        listDoencasGatos.add("Calicivirose");
        listDoencasGatos.add("Panleucopenia");
        listDoencasGatos.add("Otite");
        return listDoencasGatos;
    }
}