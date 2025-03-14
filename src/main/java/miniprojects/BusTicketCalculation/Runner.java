package miniprojects.BusTicketCalculation;

public class Runner {
    public static void main(String[] args) {
        Bus bus = new Bus("74");
        // System.out.println("bus.seats = " + bus.seats);

        Ticket ticket = new Ticket();
        TicketReservation.start(bus, ticket);



    }
}
