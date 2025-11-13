public class Cachorro extends Animal {
    public Cachorro(String name, int age, String breed) {
        super(name, age, breed);
    }
    @Override
    public java.util.List<String> getCommonDiseases() {
        return createDiseaseList("Cinomose", "Parvovirose", "Leptospirose", "Dermatite", "Otite");
    }
}
