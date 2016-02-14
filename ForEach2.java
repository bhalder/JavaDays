import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Random;
import java.io.IOException;


public class ForEach2 {

    public static void main( String [] args ) {
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        String[] str_arr = new String[10];

        int i = 0;

        try {
            for( i = 0; i < 10 ; i++ ) {
                String a = br.readLine();
                str_arr[i] = a;        
            } 


            System.out.println("FOREACH");

            for( String str : str_arr ) {
                System.out.println(" "+str);
            } 

        }catch( IOException e ) {

        }

    }
}
