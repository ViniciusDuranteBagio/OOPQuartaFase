package TrabalhoFinal;

public class Coelho extends Animal {
    public Coelho(String nome, int idade, String raca) {
        super(nome, idade, raca);
    }

    public String[] getDoencas() {
        return new String[] {"Mixomatose", "Pasteurelose", "Sarna Auricular", "Pododermatite", "Coccidiose"};
    }
}
