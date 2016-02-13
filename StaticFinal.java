
public class StaticFinal {

    static final int CONST_GLOBAL = 200;
    public static void main( String [] args ) {
        final int CONST_LOCAL = 100; // Static Local variables are not allowed
        
        System.out.println("MAIN : CONST_GLOBAL - "+CONST_GLOBAL);
        System.out.println("MAIN : CONST_LOCAL - " +CONST_LOCAL);
        another_func();
 
    }

    public static void another_func() {

        System.out.println("ANOTHER : GLOBAL "+CONST_GLOBAL);
    }
}
