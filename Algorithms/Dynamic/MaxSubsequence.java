public class MaxSubsequence {

    public static int getMaxSub( int[] numbers ) {
        int max = 0;
        int len = numbers.length;
        int[] dp = new int[ len ];
        dp[0] = numbers[0];

        for( int i = 1; i < len; i++ ) {
            if( numbers[i] > dp[i-1]+numbers[i] ) {
                dp[i] = numbers[i];
            } else {
                dp[i] = numbers[i] + dp[i-1];
            }
        }       

        System.out.println("\nThe DP array is : ");
        for( int i = 0; i < len; i++ ) {
            System.out.print(" "+dp[i]);
            if( dp[i] > max ) {
                max = dp[i];
            }
        }

        return max;
    }

    public static void main( String [] args ) {
        int num = Integer.parseInt( args[0] );
        int[] numbers = new int[ num ];
        int range = Integer.parseInt( args[1] );

        for( int i = 0; i < num; i++ ) {
            int sign = (int) (Math.random() * 3);
            int n = (int) (Math.random() * range );
            if( sign == 0 ) {
                numbers[i] = n * -1;
            } else {
                numbers[i] = n;
            }
        }                

        System.out.print("The array is - ");
        for( int i = 0; i < num; i++ ) {
            System.out.print(" "+numbers[i]);
        }

        int max = getMaxSub( numbers );
        System.out.println("\n\nThe maximum Subsequence is "+max); 
    }
}
