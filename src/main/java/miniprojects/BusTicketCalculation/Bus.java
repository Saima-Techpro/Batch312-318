package miniprojects.BusTicketCalculation;

import java.util.ArrayList;
import java.util.List;

public class Bus {

    // bus number , list of seats available
    public String busNum;
    public List<String> seats = new ArrayList<>();


    public Bus(String busNum){ // we use a parameterised constructor to ensue that each bus object has ha bus number (route number)
        this.busNum = busNum;

        // We initiate the list inside the constructor so that a new list of 32 seats is available every time
        // a new bus object is created

        for (int i = 1; i < 33; i++) {
            seats.add(i + "");
        }
        // System.out.println("seats = " + seats);

    }


}
