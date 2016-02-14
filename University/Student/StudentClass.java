package University.Student;
import University.Person;

public class StudentClass extends Person {

    private String course;

    public StudentClass ( String name, int age, String course ) {
        super( name, age);
        this.course = course;
    }

    public getCourse() {
        return this.course;
    }
}
