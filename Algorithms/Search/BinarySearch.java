import java.util.Scanner;
import java.util.Arrays;


public class BinarySearch {

    public static void main(String [] args) {
        int len = args.length;
        int[] numbers = new int[len];

        int i = 0;
        for( i = 0; i < len; i++ ) {
            numbers[i] = (Integer.parseInt( args[i] ));
        }
        Arrays.sort( numbers );

        System.out.println("Enter the number to search");
        Scanner kbd = new Scanner( System.in );
        int search = kbd.nextInt();

        System.out.println("Searching for = "+search);

        int low = 0;
        int high = len-1;

        while( low <= high ) {
            int mid = (high + low ) / 2;        
            if( numbers[ mid ] > search ) {
                high = mid - 1;
            } else if ( numbers[ mid ] == search ) {
                System.out.println("Found!");
                return;
            } else {
                low = mid+1;
            }

        }

        System.out.println("Not Found");
        return;
    }
}
