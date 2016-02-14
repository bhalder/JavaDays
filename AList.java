import java.util.Random;
import java.util.ArrayList;

public class AList {

    public static void main( String[] args ) {

        // Create an arraylist for integers
        ArrayList<Integer> a_list = new ArrayList<Integer>();
        Random rand = new Random();
        for( int i = 0; i < 10; i++ ) {
            a_list.add(rand.nextInt(20));
        }

        System.out.println("A_List.get " + a_list.get(2));
        a_list.set(2, 500);
        System.out.println("A_List.set " + a_list.get(2));

    }
}
