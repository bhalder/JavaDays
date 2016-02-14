package University;
import University.Person;

public class UniversityTest {

    public static void main( String [] args ) {
        PersonClass n = null;
        StudentClass student1 = new StudentClass( "Bill", 21, "MSIT");
        StudentClass student2 = new StudentClass( "Jill", 20, "MSIN");

        FacultyClass faculty = new FacultyClass( "Blum", 45, 10);
        n = student2;
        student1.getName();
        n.getCourse();

        faculty.getName();
        facutly.getAge();
        
    }
}

