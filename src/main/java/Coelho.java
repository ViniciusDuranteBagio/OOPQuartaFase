public class Coelho extends Animal {
    public Coelho(String name, int age, String breed) {
        super(name, age, breed);
    }
    @Override
    public java.util.List<String> getCommonDiseases() {
        return createDiseaseList("Mixomatose", "Pasteurelose", "Sarna Auricular", "Pododermatite", "Coccidiose");
    }
}
