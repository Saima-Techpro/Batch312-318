package day21datetime_passbyvalue;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Datetime02 {
    public static void main(String[] args) {
        // LocalTime is also a data type in Java

        /*
        LocalTime Class uses date and time formats

            HH : mm ==> 24-hour clock system
            hh : mm ==> 12-hour clock system AM, PM not shown
            hh : mm a ==> 12-hour clock system AM, PM
            HH : mm : ss ==> shows seconds
            HH : MM ==> incorrect format because MM is used for months
            "mm" stands for "minute". "MM" stands for "month".

            dd-MM-yyyy ==> day - month - year
            MMM ==> Aug
            MMMM ==> August

         */


        // Get the current time
        LocalTime currentTime = LocalTime.now();
        System.out.println("currentTime = " + currentTime); // 22:34:12.990405

        // format the current time
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("hh:mm a");
        System.out.println("formated time = " + dtf.format(currentTime));



        // Format the date
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
        System.out.println("formated date  = " +dtf1.format(LocalDate.now()));

        // What's the time in your part of the world?

        LocalTime currentLondonTime = LocalTime.now(ZoneId.of("Europe/London"));
        System.out.println("currentLondonTime = " + currentLondonTime);


        LocalTime currentDubaiTime = LocalTime.now(ZoneId.of("Asia/Dubai"));
        System.out.println("currentDubaiTime = " + currentDubaiTime);

        LocalTime currentBerlinTime = LocalTime.now(ZoneId.of("Europe/Berlin"));
        System.out.println("currentBerlinTime = " + currentBerlinTime);

        LocalTime currentIstanbulTime = LocalTime.now(ZoneId.of("Europe/Istanbul"));
        System.out.println("currentIstanbulTime = " + currentIstanbulTime);


        // Can we use date and time together?
        // Yes
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("currentDateTime = " + currentDateTime); // 2025-02-27T22:49:51.132177


        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("dd-MMM-yy - HH:mm");
        String currentDateTimeFormated = dtf2.format(currentDateTime);
        System.out.println("currentDateTimeFormated = " + currentDateTimeFormated); // 27-Feb-25 - 22:51

    }
}
