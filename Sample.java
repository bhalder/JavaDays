/******************************************************************************
 *  Compilation:  javac Sample.java
 *  Execution:    java Sample M N
 *
 *  This program takes two command-line arguments M and N and produces
 *  a random sample of M of the integers from 0 to N-1.
 *
 *  % java Sample 6 49
 *  10 20 0 46 40 6
 *
 *  % java Sample 10 1000
 *  656 488 298 534 811 97 813 156 424 109
 *
 ******************************************************************************/

public class Sample {

    public static void main( String[] args ) {
        int M = Integer.parseInt( args[0] ); 
        int N = Integer.parseInt( args[1] );

        for( int i  = 0; i < M; i++ ) {
            int out = (int) (Math.random() * (N-1));
            System.out.print(out+" ");
        }
        System.out.println("");

    }
}
