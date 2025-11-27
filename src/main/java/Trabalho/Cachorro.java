package Trabalho;

public class Cachorro extends Animal {
    private String[] listaDoenca = {"Cinomose", "Parvovirose", "Leptospirose", "Dermatite", "Otite"};

    @Override
    public String[] getListaDoenca() {
        return listaDoenca;
    }


}
