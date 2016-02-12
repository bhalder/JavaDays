import java.util.Scanner;

public class AgeInFive {

    public static void main( String [] args ) {

        Scanner kbd = new Scanner( System.in );
        
        System.out.println("Enter your name : ");
        String name = kbd.nextLine(); 
        
        System.out.println("Enter your age : ");
        int age = kbd.nextInt();

        System.out.println("Your age in 5 years would be : "+ (age+5)+"Imagine that "+name);

    }

}
