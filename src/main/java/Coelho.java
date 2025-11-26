public class Coelho extends Animal {
    private static final String[] DOENCAS = {
            "Mixomatose", "Pasteurelose", "Sarna Auricular", "Pododermatite", "Coccidiose"
    };

    public Coelho(String nome, int idade, String raca) throws ValidacaoException {
        super(nome, idade, raca);
    }

    @Override
    public String[] getDoencasPossiveis() {
        return DOENCAS.clone();
    }
}
