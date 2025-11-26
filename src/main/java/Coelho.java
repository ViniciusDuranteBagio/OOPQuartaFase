
public class Coelho extends Animal {

    private static final String[] DOENCAS_COMUNS = {
            "Mixomatose", "Pasteurelose", "Sarna Auricular", "Pododermatite", "Coccidiose"
    };

    public Coelho(String nome, int idade, String raca) {
        super(nome, idade, raca);
    }

    @Override
    public String[] getDoencasComuns() {
        return DOENCAS_COMUNS;
    }
}