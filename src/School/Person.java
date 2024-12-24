package School;

public class Person {
    private String name;
    private String surname;
    private int age;
    private boolean gender;
    Person() {

    }
    Person(String name, String surname, int age, boolean gender) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
    }
    @Override
    public String toString() { return name + " " + surname + " " + age + " " + (gender? "Male" : "Female"); }
}
