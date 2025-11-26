public class Coelho extends Animal {

    public Coelho(String apelido, int anos, String tipoRaca) {
        super(apelido, anos, tipoRaca);
    }

    @Override
    public String[] doencas() {
        return new String[] {
                "Mixomatose",
                "Pasteurelose",
                "Sarna Auricular",
                "Pododermatite",
                "Coccidiose"
        };
    }
}