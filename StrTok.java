import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class StrTok {

    public static void main( String [] args ) {
        StringTokenizer str;

        BufferedReader br = new BufferedReader( new InputStreamReader(System.in) );
        try {
            String line = br.readLine();
            System.out.println("Line read is "+line);
            str = new StringTokenizer( line );
            if( str.countTokens()<1) {
                return;       
            } else {
                System.out.println("Count of Tokens is "+str.countTokens());
                System.out.println("Count of Tokens is "+str.countTokens());
                int count = str.countTokens();
                for( int i = 0; i < count; i++ ) {
                    System.out.println("===> "+ str.nextToken());
                }
            }

        } catch( IOException e ) {


        }

    }
}
