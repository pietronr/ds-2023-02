package comparators;
import java.util.Comparator;
import classes.Student;

public class StudentByAgeComparator implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
        return Integer.compare(s1.getAge(), s2.getAge());
    }
}
