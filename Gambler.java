
/******************************************************************************
 *  Compilation:  javac Gambler.java
 *  Execution:    java Gambler stake goal N
 *  
 *  Simulates a gambler who start with $stake and place fair $1 bets
 *  until she goes broke or reach $goal. Keeps track of the number of
 *  times she wins and the number of bets she makes. Run the experiment N
 *  times, averages the results, and prints them out.
 *
 *  % java Gambler 50 250 1000
 *  178 wins of 1000
 *  Percent of games won = 17.8
 *  Avg # bets           = 10010.79
 *
 *  % java Gambler 50 150 1000
 *  337 wins of 1000
 *  Percent of games won = 33.7
 *  Avg # bets           = 4863.95
 * 
 *  % java Gambler 50 100 1000
 *  503 wins of 1000
 *  Percent of games won = 50.3
 *  Avg # bets           = 2464.59
 *
 ******************************************************************************/

public class Gambler {

    public static void main( String[] args ) {
        int stake = Integer.parseInt( args[0] );
        int goal = Integer.parseInt( args[1] );
        int N = Integer.parseInt( args[2]);

        int rand;
        int ch;

        int i = 0;

        int total_games = 0;
        int total_wins = 0;
        int total_losses = 0;

        for( i = 0 ; i < N ; i++ ) {
            int money_earned = 0;
            int money_left = stake;
            int wins = 0;
            int games = 0;
            int loss = 0;
    
            while( money_earned < goal || money_left > 0 ) {
                games++;
                ch = (int)  ( Math.random() * 2.0);
                rand = (int) (Math.random() * 2.0);

                if( ch == rand ) {
                    money_earned++;                
                    wins++;
                } else {
                    money_left--;
                    loss++;
                }
                
            }
            total_games += games;
            total_wins += wins;
            total_losses += loss;
        }
        System.out.println("%won : " + (double) total_wins/(double)total_games);
        System.out.println("%loss : " + (double) total_losses/(double)total_games);
    }
}
