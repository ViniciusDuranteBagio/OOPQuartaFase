public class Coelho extends Animal {
    public Coelho(String name, int age, String breed) throws ValidacaoException {
        super(name, age, breed);
    }
    @Override
    public java.util.List<String> getCommonDiseases() {
        return criarListaDoencas("Pododermatite", "Mixomatose", "Coccidiose", "Sarna Auricular", "Pasteurelose");
    }
}
