public class Animation {

    public static void main( String [] args ) throws Exception{
    

        for( int i = 0; i < 100; i++ ) {
            switch( i%4) {
                case 0:
                        System.out.print("...\r");
                        break;
                case 1:
                        System.out.print(" ...\r");
                        break;
                case 2:
                        System.out.print("  ...\r");
                        break;
                case 3:
                        System.out.print("     \r");
                        break;
            }
            Thread.sleep(200);
        }
    }

}
