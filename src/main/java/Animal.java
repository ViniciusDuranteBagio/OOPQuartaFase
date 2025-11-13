public abstract class Animal {
    private String name;
    private int age;
    private String breed;

    public Animal(String name, int age, String breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    protected java.util.List<String> createDiseaseList(String... diseases) {
        java.util.List<String> list = new java.util.ArrayList<>();
        for (String disease : diseases) {
            list.add(disease);
        }
        return list;
    }
    public abstract java.util.List<String> getCommonDiseases();
}
