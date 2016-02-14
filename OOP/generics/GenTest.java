
public class GenTest {

    public static void main( String [] args ) {
        Gen<Integer> num1 = new Gen<Integer>(10);
        Gen<Integer> num2 = new Gen<Integer>(20);
        System.out.println("Add Int "+ (num1.add(20)));
        Gen<String> str = new Gen<String>("Hello");
        System.out.println("Add String "+ (str.add(" Kitty!")));

        if( num1.compareTo( 20 ) == 0 ) {
            System.out.println("EQUAL");
        }

    }
}
