public class EmployeePerson implements Employee, Person {
    private String name;
    private int age;
    public static int ID = 10000;
    private int id;

    public EmployeePerson( String name , int age ) {
        this.name = name;
        this.age = age;
        this.id = ID++;
    } 

    public void getName() {
        System.out.println("Your name is : "+name);
    }

    public void getAge() {
        System.out.println("Your age is : "+age);
    }

    public void getID() {
        System.out.println("Your ID is : "+id);
    }

}
