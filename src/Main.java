import School.Person;
import School.School;
import School.Student;
import School.Teacher;

import java.util.ArrayList;
import java.util.Scanner;

import java.io.File;
import java.io.FileNotFoundException;


public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<Student> students = new ArrayList<>();
        ArrayList<Teacher> teachers  = new ArrayList<>();
        School school = new School();

        File studentsFile = new File("src/example/students.txt");
        File teachersFile = new File("src/example/teachers.txt");

        Scanner studentScanner = new Scanner(studentsFile);
        while (studentScanner.hasNextLine()) {
            String line = studentScanner.nextLine();
            String[] parts = line.split(" ");

            String name = parts[0];
            String surname = parts[1];
            int age = Integer.parseInt(parts[2]);
            boolean gender = parts[3].equalsIgnoreCase("Male");

            ArrayList<Integer> grades = new ArrayList<>();
            for (int i = 4; i < parts.length; i++) {
                grades.add(Integer.parseInt(parts[i]));
            }

            Student student = new Student(name, surname, age, gender);
            for (int grade : grades) {
                student.addGrade(grade);
            }

            students.add(student);
            school.addMember(student);
        }
        Scanner teacherScanner = new Scanner(teachersFile);
        while (teacherScanner.hasNextLine()) {
            String line = teacherScanner.nextLine();
            String[] parts = line.split(" ");

            String name = parts[0];
            String surname = parts[1];
            int age = Integer.parseInt(parts[2]);
            boolean gender = parts[3].equalsIgnoreCase("Male");
            int salary = Integer.parseInt(parts[4]);
            String subject = parts[5];
            int yearsOfExperience = Integer.parseInt(parts[6]);

            Teacher teacher = new Teacher(name, surname, age, gender, salary, subject, yearsOfExperience);
            teachers.add(teacher);
            school.addMember(teacher);
        }
        for (Teacher teacher : teachers) {
            if (teacher.getYearsOfExperience() > 10){
                teacher.giveRaise(10);
            }
            System.out.println(teacher.toString());
        }
        for (Student student : students) {
            System.out.println(student.toString() + " GPA: " + student.calculateGPA());
        }
        studentScanner.close();
        teacherScanner.close();

    }
}