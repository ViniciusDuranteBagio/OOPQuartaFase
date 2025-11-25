package TrabalhoFinal;

class Coelho extends Animal {

    public Coelho(String nome, int idade, String raca) throws ValidacaoException {
        super(nome, idade, raca);
    }

    public String[] getDoencasComuns() {
        return new String[]{"Mixomatose", "Pasteurelose", "Sarna Auricular", "Pododermatite", "Coccidiose"};
    }
}