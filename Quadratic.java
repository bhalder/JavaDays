/******************************************************************************
 *  Compilation:  javac Quadratic.java
 *  Execution:    java Quadatic b c
 *  
 *  Given b and c, solves for the roots of x*x + b*x + c.
 *  Assumes both roots are real valued.
 *
 *  % java Quadratic -3.0 2.0
 *  2.0
 *  1.0
 *
 *  % java Quadratic -1.0 -1.0
 *  1.618033988749895
 *  -0.6180339887498949
 *
 *  Remark:  1.6180339... is the golden ratio.
 *
 *  % java Quadratic 1.0 1.0
 *  NaN
 *  NaN
 *
 *
 ******************************************************************************/

public class Quadratic {

    public static void main( String[] args ) {
        double b = Double.parseDouble( args[0] );
        double c = Double.parseDouble( args[1] );

        double delta = Math.sqrt( b * b - 4 * c );

        double solution1 = ( -b + delta ) / 2.0;
        double solution2 = ( -b - delta ) / 2.0;

        System.out.println("Sol 1 : "+solution1);
        System.out.println("Sol 2 : "+solution2);

    }
}
