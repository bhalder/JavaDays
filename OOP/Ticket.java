public class Ticket {

    private static int TicketSeed;
    private int serialNumber;
    private int price;

    static {
        TicketSeed = 12344;
    }

    public Ticket( int price ) {
        this.serialNumber = Ticket.TicketSeed++;
        this.price = price;
    }

    public void printTicket() {
        System.out.println("The ticket purchased for $"+this.price+" has Serial number #"+this.serialNumber);
    }

}
