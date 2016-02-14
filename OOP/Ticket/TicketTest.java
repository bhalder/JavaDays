import TicketMain.Ticket;

public class TicketTest {

    public static void main( String[] args ) {
        Ticket t1 = new Ticket( 50 );
        Ticket t2 = new Ticket( 60 );

        t1.printTicket();
        t2.printTicket();
    }
}
