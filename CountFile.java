import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileNotFoundException;

public class CountFile {

    public static void main( String [] args ) {
        String fileName = args[0];
        int characterCount = 0;
        int wordCount = 0;
        int lineCount = 0;
    
        int i = 0, j = 0;

        try {             
            BufferedReader br = new BufferedReader( new FileReader( fileName ) );
            String s;
            while( (s = br.readLine() ) != null ) {
                j = s.length();
                lineCount++;
                characterCount+=j;
                wordCount++;
                for( i = 0; i < j; i++ ) {
                    if( s.charAt(i) == ' ') {
                        wordCount++;
                    }
                } 
            }
            
            System.out.println("Line Count = "+lineCount+"\nWord Count = "+wordCount+"\nCharacter Count = "+characterCount);
        } catch ( IOException e ) {


        } finally {

        }   
    }
}
