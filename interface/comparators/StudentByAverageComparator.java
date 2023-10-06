package comparators;
import java.util.Comparator;
import classes.Student;

public class StudentByAverageComparator implements Comparator<Student> {
    
    @Override
    public int compare(Student s1, Student s2) {
        return Double.compare(s1.getAverage(), s2.getAverage());
    }
}
