package comparators;
import java.util.Comparator;
import classes.Student;

public class StudentByProfessorComparator implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
        return s1.getProfessor().compareTo(s2.getProfessor());
    }
}