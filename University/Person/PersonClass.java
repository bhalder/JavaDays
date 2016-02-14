package University.Person;

public class PersonClass {

    public static final universityName = "Carnegie Mellon University";
    private String name;
    private int age;

    public PersonClass( String name, int age ) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    
    public final void personFinal() {
        System.out.println("This is the final function of Person.");
    }
}
