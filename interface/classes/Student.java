package classes;

public class Student implements Comparable<Student> {
    public String name;
    public String lastName;
    public int age;
    public double average;
    public String professor;
    public String schoolClass;

    @Override
    public int compareTo(Student s) {
        return this.name.compareTo(s.name);
    }

    public String getName() {
         return name;
    }

    public void setName(String nameString) {
        this.name = nameString;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastNameString) {
        this.lastName = lastNameString;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int ageValue) {
        this.age = ageValue;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double averageValue) {
        this.average = averageValue;
    }

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professorString) {
        this.professor = professorString;
    }

    public String getSchoolClass() {
        return schoolClass;
    }

    public void setSchoolClass(String schoolClassString) {
        this.schoolClass = schoolClassString;
    }

    public String ToString() {
        return this.name;
    }
}
