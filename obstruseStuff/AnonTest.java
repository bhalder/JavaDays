public class AnonTest {

    public static class ClassA {

        public void read( String S ) {
            System.out.println("Class A read "+S);
        }

    }

    public static void main(String [] args) {
        ClassA aObj = new ClassA() { 
                        public void read( String S) {
                            System.out.println("Class B read (The anon class)"+ S);
                        }
                    };

        aObj.read( "Test");
    }

    

}
