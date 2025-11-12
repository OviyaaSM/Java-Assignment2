class TicketBooking {
    private int tickets = 1;

    synchronized void bookTicket(String name) {
        if (tickets > 0) {
            System.out.println(name + " booked the ticket.");
            tickets--;
        } else {
            System.out.println("Sorry " + name + ", ticket not available.");
        }
    }
}

public class BookingSystem {
    public static void main(String[] args) {
        TicketBooking tb = new TicketBooking();

        Thread t1 = new Thread(() -> tb.bookTicket("Customer 1"));
        Thread t2 = new Thread(() -> tb.bookTicket("Customer 2"));

        t1.start();
        t2.start();
    }
}
