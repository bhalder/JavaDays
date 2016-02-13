import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;


public class BufferRead {

    public static void main( String[] args ) {
        BufferedReader bf = new BufferedReader( new InputStreamReader(System.in ) );

        // You must ALWAYS catch the input IOException
        try {
            String name = bf.readLine();
            System.out.println("Hello! "+name);
        } catch (IOException e ) {
            System.out.println("IOException");
        }        
    }
}
