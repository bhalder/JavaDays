public class AbstTest {

    public static void main( String [] args ) {
        Abst a = null;
        Abst1 b = new Abst1();
        Abst2 c = new Abst2();

        a = c;
        a.overrideFunc();
        b.changeThis();
        c.changeThis();
        b.cannotChangeThis();

        a.abst2Func();

    }

}
