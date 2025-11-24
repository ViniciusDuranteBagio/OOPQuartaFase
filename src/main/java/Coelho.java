public class Coelho extends Animal {

    public Coelho(String nome, String idade, String raca) throws ValidacaoException {
        super(nome, idade, raca);
    }

    @Override
    public String[] getDoencas() {
        return new String[]{
                "Mixomatose",
                "Pasteurelose",
                "Sarna Auricular",
                "Pododermatite",
                "Coccidiose"
        };
    }
}
