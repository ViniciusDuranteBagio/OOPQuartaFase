public class Gato extends Animal {
    public Gato(String name, int age, String breed) {
        super(name, age, breed);
    }
    @Override
    public java.util.List<String> getCommonDiseases() {
        return createDiseaseList("PIF (Peritonite Infecciosa Felina)", "Rinotraqueíte", "Calicivirose", "Panleucopenia", "Otite");
    }
}
