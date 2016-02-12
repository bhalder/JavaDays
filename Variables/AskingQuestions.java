import java.util.Scanner;

public class AskingQuestions {

    public static void main( String [] args ) {
        Scanner kbd = new Scanner(System.in);

        String name;

        System.out.println(" What is your name ? ");
        name = kbd.nextLine();

        System.out.println(" What is your age ? ");
        int age = kbd.nextInt();

        System.out.println(" What is your height ? ");
        double height = kbd.nextDouble();

        System.out.println("Hello! "+name);
        System.out.println("Age : "+age);

    }
}
