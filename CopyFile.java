
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.InputStreamReader;

import java.io.IOException;


public class CopyFile {

    public static void main( String [] args ) {
        System.out.println("\nEnter the name of the file : ");
        BufferedReader br;
        br = new BufferedReader( new InputStreamReader( System.in ) );

        try {
            String line = br.readLine();
            BufferedReader bk = new BufferedReader( new FileReader( line ) );
            PrintWriter pw = new PrintWriter( new FileWriter(line+".bk") );

            while( ( line = bk.readLine() ) != null ) {
                System.out.println(" LINE " + line);
                pw.println( "He");
            } 

        } catch ( IOException e ) {
    
        }
    }
}
