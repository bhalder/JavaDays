package University.Faculty;
import University.Person;

public class FacultyClass extends Person {

    private int tenure;

    public FacultyClass( String name, int age, int tenure ) {
        this.tenure = tenure;
        super( name, age);
    }

    public String getName() {
        return ("This is Professor"+super.getName());
    }

    public int getTenure() {
        return tenure;
    }
}

