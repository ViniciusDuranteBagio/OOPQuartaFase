public class Coelho extends Animal {

    private static final String[] DOENCAS = {
            "Mixomatose", "Pasteurelose", "Sarna Auricular", "Pododermatite", "Coccidiose"
    };

    public Coelho(String nome, int idade, String raca) {
        super(nome, idade, raca);
    }

    @Override
    public String[] getPossiveisDoencas() {
        return DOENCAS;
    }

    @Override
    public String toString() {
        return "Coelho\n" + super.toString();
    }
}
