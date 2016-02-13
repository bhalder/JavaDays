import java.util.Random;

public class ArrRand {

    public static void main( String [] a ) {
        int len = Integer.parseInt( a[0] );
        Random rand = new Random();
        int [] i_Arr = new int[ len ];

        for(int i = 0; i < i_Arr.length; i++ ) {
            i_Arr[i] = (int) (rand.nextInt(20));
        }

        for(int i = 0; i < i_Arr.length; i++ ) {
           System.out.println("=> "+i_Arr[i]); 
        }
    }

}
