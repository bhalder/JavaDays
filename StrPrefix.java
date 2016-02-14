public class StrPrefix {

    public static boolean isPrefix( String str1, String str2 ) {

        int i =0;
        int len = str1.length();
        int match = 0;

        for( i = 0; i < len; i++ ) {
            if( str1.charAt(i) != str2.charAt(i) ) {
                break;
            }
            match++;
        }
            
        if( match == len ) {
            return true;
        } else {
            return false;
        }        
    }

    public static void main( String[] args ) {
        if( isPrefix(args[0], args[1] ) ) {
            System.out.println("Is a prefix");
        } else {
            System.out.println("NOT a prefix");
        } 
    }
}
