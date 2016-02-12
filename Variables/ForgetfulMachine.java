import java.util.Scanner;

public class ForgetfulMachine {

    public static void main( String[] args ) {
        Scanner kbd = new Scanner( System.in );

        System.out.println("Give me a number?");
        kbd.nextInt();
        
        System.out.println("Give me another number?");
        kbd.nextInt();


        System.out.println("Your Favourite number is : "+(int) (100 * Math.random()));

    }

}
