import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import classes.Student;
import comparators.StudentByAgeComparator;
import comparators.StudentByAverageComparator;
import comparators.StudentByProfessorComparator;

public class Main {
    public static void main(String[] args) {
        
        List<Student> students = new ArrayList<>();

        Student s1 = new Student();
        s1.setAge(15);
        s1.setName("Silva");
        s1.setProfessor("Fábio");
        s1.setAverage(6.6);

        Student s2 = new Student();
        s2.setAge(7);
        s2.setName("Arthur");
        s2.setProfessor("Jacson");
        s2.setAverage(6.9);;

        Student s3 = new Student();
        s3.setAge(10);
        s3.setName("Bruno");
        s3.setProfessor("Alessandro");
        s3.setAverage(6.1);

        students.add(s1);
        students.add(s2);
        students.add(s3);

        Collections.sort(students);

        for (Student s : students) {
            System.out.println(s.getName());
        }

        System.out.println("----------------");

        Collections.sort(students, new StudentByAgeComparator());

        for (Student s : students) {
            System.out.println(s.getAge());
        }

        System.out.println("----------------");

        Collections.sort(students, new StudentByAverageComparator());

        for (Student s : students) {
            System.out.println(s.getAverage());
        }

        System.out.println("----------------");

        Collections.sort(students, new StudentByProfessorComparator());

        for (Student s : students) {
            System.out.println(s.getProfessor());
        }

        System.out.println("----------------");
    }
}