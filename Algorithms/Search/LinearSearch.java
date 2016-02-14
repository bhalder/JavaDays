
import java.util.ArrayList;
import java.util.Scanner;


public class LinearSearch {

    public static void main(String [] args) {
        int len = args.length;
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        int i = 0;
        for( i = 0; i < len; i++ ) {
            numbers.add(Integer.parseInt( args[i] ));
        }

        System.out.println("Enter the number to search");
        Scanner kbd = new Scanner( System.in );
        int search = kbd.nextInt();

        System.out.println("Searching for = "+search);
        for( i = 0; i < len; i++ ) {
            if( numbers.get(i) == search ) {
                System.out.println("FOUND");
                return;
            }
        }     
        System.out.println("Not Found");
        return;
    }
}
