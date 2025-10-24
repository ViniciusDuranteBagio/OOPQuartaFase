package aula1;

public class person {
    private int age;
    private String name;

    public person(String newName, int newAge) {
        name = newName;
        age = newAge;
    }

    public person(String newName) {
        name = newName;
    }

    public person() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(Integer age) {
        if (age < 0) {
            age = 0;
        }
        this.age = age;
    }
}
