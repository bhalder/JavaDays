
/******************************************************************************
 *  Compilation:  javac Average.java
 *  Execution:    java Average < data.txt
 *  Dependencies: StdIn.java StdOut.java
 *  
 *  Reads in a sequence of real numbers, and computes their average.
 *
 *  % java Average
 *  10.0 5.0 6.0
 *  3.0 7.0 32.0
 *  <Ctrl-d>
 *  Average is 10.5
 *
 *  Note <Ctrl-d> signifies the end of file on Unix.
 *  On windows use <Ctrl-z>.
 *
 ******************************************************************************/

public class Average {

    public static void main ( String [] args ) {

        int count = 0;
        double sum = 0.0;

        ObjectInputStream StdIn = new ObjectInputStream(System.in);

        while( !StdIn.isEmpty() ) {
            double n = StdIn.readDouble();
            sum += n;
            count++;            
        }
        System.out.println("\nThe Average is = "+sum/(double)count);
    
    }
}
