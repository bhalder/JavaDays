import java.util.Random;
import java.util.ArrayList;

public class ForEach {

    public static void main( String [] args ) {
        int len = Integer.parseInt( args[0] );
        Random rand = new Random();

        ArrayList<Integer> a_list = new ArrayList<Integer>();

        for( int i = 0; i < len; i++ ) {
           a_list.add( rand.nextInt( 200 ) ); 
        } 

        System.out.println("Printing using ForEach Like syntax");
        for( int num : a_list ) {
            System.out.println("=> "+num);
        }
    }
}
