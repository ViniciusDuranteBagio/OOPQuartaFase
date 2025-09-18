package Aula1;

class Person {
    private int age;
    private String name;

    public Person(String newName, int newAge) {
        name = newName;
        age = newAge;
    }

    public Person(String newName) {
        name = newName;
    }

    public Person() {}

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

