class Theater {
    private int availableSeats;

    public Theater(int availableSeats) {
        this.availableSeats = availableSeats;
    }

    synchronized void reserveSeats(int requestedSeats, int customerId) {
        if (availableSeats >= requestedSeats) {
            availableSeats -= requestedSeats;
            System.out.println("Customer " + customerId + " reserved " + requestedSeats + " tickets.");
        } else {
            System.out.println("Customer " + customerId + " couldn't reserve " + requestedSeats + " tickets.");
        }
    }
}

class TicketTerminal extends Thread {
    private Theater theater;
    private int requestSeatCount;
    private int customerId;

    public TicketTerminal(Theater theater, int requestSeatCount, int customerId) {
        this.theater = theater;
        this.requestSeatCount = requestSeatCount;
        this.customerId = customerId;
    }

    public void run() {
        theater.reserveSeats(requestSeatCount, customerId);
    }
}

public class TicketReservationSystem {
    public static void main(String[] args) {
        Theater theater = new Theater(20);

        TicketTerminal[] customers = new TicketTerminal[20];
        
        for (int i = 1; i <= 20; i++) {
            int requestSeatCount = (int) (Math.random() * 5) + 1;
            customers[i - 1] = new TicketTerminal(theater, requestSeatCount, i);
        }

        for (TicketTerminal customer : customers) {
            customer.start();
        }
    }
}
