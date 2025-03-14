package miniprojects.BusTicketCalculation;

public class Ticket {

    // Distance, Journey Type, Price, Seat No.

    public double distance;
    public int journeyType;
    public int seatNo;
    public double price;


    // Create a method to print all the details on the ticket
    public void printTicket(Bus bus){ //
        System.out.println("----------- Ticket Details ----------");
        System.out.println("Bus Num = " + bus.busNum);
        System.out.println("Distance = " + this.distance + " km");
        System.out.println("Journey Type: " + (this.journeyType == 1 ? "One Way" : "Round Trip") );
        System.out.println("Seat No = " + this.seatNo);
        // System.out.println("Total Price= $" + this.price);
        System.out.println("Total Price= $" + Math.round(this.price));
        System.out.println("Have a nice trip!");
    }







}
