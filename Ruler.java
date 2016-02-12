public class Ruler {

    public static void main( String[] args ) {
        String ruler = "1";
        String ruler1 = ruler + "2" + ruler;
        String ruler2 = ruler1 + "3" + ruler1;
        String ruler3 = ruler2 + "4" + ruler2;
        String ruler4 = ruler3 + "5" + ruler3;
        String ruler5 = ruler4 + "6" + ruler4;
        String ruler6 = ruler5 + "7" + ruler5;
        String ruler7 = ruler6 + "8" + ruler6;

        System.out.println(ruler);
        System.out.println(ruler1);
        System.out.println(ruler2);
        System.out.println(ruler3);
        System.out.println(ruler4);
        System.out.println(ruler5);
        System.out.println(ruler6);
        System.out.println(ruler7);

    }

}
