public class Coelho extends Animal {
    public Coelho(String nome, int idade, String raca) throws ValidacaoException {
        super(nome, idade, raca);
    }

    private String[] doencas = {
            "Mixomatose",
            "Pasteuralose",
            "Sarna Auricular",
            "Pododermatite",
            "Coccidiose"
    };

    @Override
    public String[] getDoencasComuns() {
        return doencas;
    }

}
