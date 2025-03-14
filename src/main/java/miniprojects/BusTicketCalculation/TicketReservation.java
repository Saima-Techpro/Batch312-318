package miniprojects.BusTicketCalculation;

import java.util.Scanner;

public class TicketReservation {

    // Create start() method which will be called to start the reservation process


    public static void start(Bus bus, Ticket ticket){
        Scanner scanner = new Scanner(System.in);

        // Use loop to present the choices / options to every passenger once this start() is called

        int select;
        do{
            System.out.println("Welcome to Flixbus Transport Reservation Desk");

            // Get the distance from the user
            System.out.println("Enter the distance that you want travel");
            double userDistance = scanner.nextDouble();

            // Get the journey type from the user
            System.out.println("Choose the journey trip");
            System.out.println("1 - One Way \n2 - Round Trip");
            int userJourneyType = scanner.nextInt();

            // Get age from the user
            System.out.println("Enter your age");
            int userAge = scanner.nextInt();

            // Ask user to choose the seat
            System.out.println("Please choose the seat");
            System.out.println("Single seats are 20% more expensive than others");

            // Present the list of available seats to the user, so they can choose a seat
            System.out.println("Available seats = " + bus.seats);

            int userSeat = scanner.nextInt(); // now we save the seat chosen by the user in this variable


            // remove the seat chosen by the user from the available seats list
            bus.seats.remove(String.valueOf(userSeat));


            /*
            Conditions to check the validity of the user input:
            values received from the user must be valid (distance and age are positive numbers, trip type is 1 or 2).
            Otherwise, "You Have Entered Wrong Data!" or Any warning should be given.
             */

            boolean check = userJourneyType == 1 || userJourneyType == 2;

            if (userDistance > 0 && userAge > 0 && check ){

                // if all conditions are true, then we will initialise the variables stored in Ticket
                // class with the values provided by user

                ticket.distance = userDistance;
                ticket.journeyType = userJourneyType;
                ticket.seatNo = userSeat;

                // Calculate the price
                calculatePrice(ticket, userAge);
                // print the ticket
                ticket.printTicket(bus);


            }else {
                System.out.println("You Have Entered Wrong Data!");
            }

            // Give option to the user if they want to continue or not?
            System.out.println("Press 0 to quit or enter any other number to restart!");
            select = scanner.nextInt();


        }while (select != 0);


    }


    // Create calculatePrice() method which will implement all discounts and return final price

    public static double calculatePrice(Ticket ticket, int age){
        // distance, journeyType, seatNo, age

        // store these variables in local variables to apply discounts
        double dis = ticket.distance;
        int type = ticket.journeyType;
        int seat = ticket.seatNo;


        double total = 0;

        switch (type){
            case 1: // one way trip
                if (seat % 3 == 0){ // if single seat is chosen, ticket price is increased by 20%.
                    total = dis * 1.2;
                }else {
                    total = dis * 1;
                }
                System.out.println("total = " + total);
                break;
            case 2: // Round trip
                if (seat % 3 == 0){ // if single seat is chosen
                    total = dis*2.4;
                }else {
                    total = dis*2;
                }
                System.out.println("total = " + total);
                // 20% discount is applied on the ticket price for Round-trip
                total = total * 0.8;
                System.out.println("Total price after discount for Round Trip" + total);
                break;

        }

        // age discount

        if (age > 0 && age < 6 ){
            total = 0;
            System.out.println("Children up to age 5 go free");
        }else if (age < 12){
            total = total * 0.5; // 50% discount
            System.out.println("Total price for child under 12 after 50% discount: " + total);
        }else if ( age < 25) {
            total = total * 0.9; // 10% discount
            System.out.println("Total price after 10% student discount: " + total);
        }else if (age > 65){
            total = total * 0.7; // 30% discount
            System.out.println("Total price after 30% elderly discount: " + total);
        }


        return ticket.price = total;
    }



}
