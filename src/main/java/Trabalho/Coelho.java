package Trabalho;

public class Coelho extends Animal {
    String[] listaDoenca = {"Mixomatose", "Pasteurelose", "Sarna Auricular", "Pododermatite", "Coccidiose"};

    @Override
    public String[] getListaDoenca() {
        return listaDoenca;
    }
}
