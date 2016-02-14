public class TestInterface {


    public static void main( String [] args ) {
        Person p;
        Employee e;

        EmployeePerson e1 = new EmployeePerson( "Sam", 23 );
        EmployeePerson e2 = new EmployeePerson( "Adam", 26 );

        p = e1;
        e = e2;

        e1.getName();
        p.getAge();
        e.getID();
    }
} 
