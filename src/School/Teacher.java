package School;

public class Teacher extends Person {
    private int salary;
    private String subject;
    private int yearsOfExperience;
    public Teacher(String name, String surname, int age, boolean gender, int salary, String subject, int yearsOfExperience) {
        super(name, surname, age, gender);
        this.salary = salary;
        this.subject = subject;
        this.yearsOfExperience = yearsOfExperience;


    }
    public void giveRaise(int raise) {
        salary += salary*(raise/100);

    }
    @Override
    public String toString() {
        return super.toString() + " I teach: " + subject;
}

public int getYearsOfExperience() {
        return yearsOfExperience;
}

}

