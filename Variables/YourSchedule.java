public class YourSchedule {

    public static void main(String [] args ) {
        String[] subjects = {"Internet Services","Distributed Systems"};
        String[] profs = {"Dave","Satya"};

        System.out.println("+---+------------------------------+----------+");
        for(int i = 0; i < 2; i++ ) {
            System.out.print("| "+(i+1)+" |");
            for(int j = 0; j < 30-subjects[i].length(); j++) {
                System.out.print(" ");
            }
            System.out.print(subjects[i]+"|");

            for(int j = 0; j < 10 - profs[i].length(); j++ ) {
                System.out.print(" ");
            }                
            System.out.println(profs[i]+"|");
        }        
        System.out.println("+---+------------------------------+----------+");
    }

}
