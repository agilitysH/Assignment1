package School;

import java.util.ArrayList;

import java.util.Random;

public class Student extends Person {
    private Random rand = new Random();
    int randomId = rand.nextInt(1000); //ToDo проверка на повторение id(опционально лул)
    private int id;
    private ArrayList<Integer> grades = new ArrayList<>();

    Student() {

    }

    public Student(String name, String surname, int age, boolean gender) {
        super(name, surname, age, gender);
        this.id = randomId;

    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    public int calculateGPA() {
        int sum = 0;
        for (int i = 0; i < grades.size(); i++) {
            sum += grades.get(i);
        }
        return sum / grades.size();
    }

    @Override
    public String toString() {
        return super.toString() + "\nI am student with d: " + id;
    }


}
