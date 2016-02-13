import java.io.FileReader;
import java.io.BufferedReader;


public class BufferRead {

    public static void main( String[] args ) {
        BufferedReader bf = new BufferedReader( new FileReader(System.in ) );
        String name = bf.readLine();

        System.out.println("Hello! "+name);
        
    }
}
