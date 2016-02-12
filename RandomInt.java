/******************************************************************************
 *  Compilation:  javac RandomInt.java
 *  Execution:    java RandomInt N
 *  
 *  Prints a pseudo-random integer between 0 and N-1.
 *  Illustrate an explicit type conversion (cast) from double to int.
 *
 *  % java RandomInt 6
 *  Your random integer is: 5
 *
 *  % java RandomInt 6
 *  Your random integer is: 0
 *
 *  % java RandomInt 1000
 *  Your random integer is: 129
 *
 *  % java RandomInt 1000
 *  Your random integer is: 333
 *
 ******************************************************************************/

public class RandomInt {

    public static void main( String [] args ) {
        int N = Integer.parseInt( args[0] );
        
        double r = Math.random();

        int num = (int) (r * N);
    
        System.out.println("The Random number generated is : " + num);

    }
}
