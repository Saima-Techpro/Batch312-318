package day21datetime_passbyvalue;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.Year;
import java.util.Scanner;

public class DateTime01 {
    public static void main(String[] args) {

        // LocalDate is also a data type in Java

        LocalDate currentDate = LocalDate.now();
        System.out.println("currentDate = " + currentDate); // 2025-02-27 US pattern , 27-02-2025 UK pattern

        // Get the value of month
        int monthValue = currentDate.getMonthValue();
        System.out.println("monthValue = " + monthValue); // 2

        Month monthName = currentDate.getMonth();
        System.out.println("monthName = " + monthName); // FEBRUARY


        // Get the value of the year
        int year = currentDate.getYear();
        System.out.println("year = " + year); // 2025
        System.out.println("year = " + Year.now()); // 2025

        // Get the day of the year

        int dayOfYear = currentDate.getDayOfYear();
        System.out.println("dayOfYear = " + dayOfYear); // 58th day of the year

        // Get the day of week of the year
        DayOfWeek weekDay = currentDate.getDayOfWeek();
        System.out.println("weekDay = " + weekDay); // THURSDAY


        int dayOfMonth = currentDate.getDayOfMonth();
        System.out.println("dayOfMonth = " + dayOfMonth); // 27


        // Get future day, month and year
        // currentDate = 2025-02-27
        LocalDate futureDate = currentDate.plusYears(3).plusMonths(5).plusDays(1);
        System.out.println("futureDate = " + futureDate); // 2028-07-28


        // Get past day, month and year
        // currentDate = 2025-02-27
        LocalDate pastDate = currentDate.minusYears(10).minusWeeks(5).minusDays(5);
        System.out.println("pastDate = " + pastDate); // 2015-01-18


        // Get the date based on specific given information
        LocalDate date1 =  LocalDate.of(1999, 6, 15);
        System.out.println("date1 = " + date1); // 1999-06-15


        LocalDate date2 =  LocalDate.of(2005, 8, 5);

        System.out.println("date2 = " + date2); // 2005-08-05

        System.out.println(date1.isAfter(date2)); // false
        System.out.println(date1.isBefore(date2)); // true

        System.out.println(date1.isLeapYear()); // false
        System.out.println(date1.getDayOfWeek()); // TUESDAY


        // Task 1: Get the exact day when you were born

        LocalDate birthdate = LocalDate.of(2002, 5, 17);
        System.out.println("birthdate = " + birthdate); // 2002-05-17
        System.out.println("BirthDay = " + birthdate.getDayOfWeek()); // FRIDAY


        // Task 2: Ask user to enter a date. Print "Invalid date" if the date entered by user
        // is from past. Otherwise, welcome the user to their account

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter year of your birth" );
        int userYear = scanner.nextInt();

        System.out.println("Please enter month of your birth" );
        int userMonth = scanner.nextInt();

        System.out.println("Please enter day of your birth" );
        int userDay = scanner.nextInt();

        LocalDate userBirthday = LocalDate.of(userYear, userMonth,userDay);
        System.out.println("userBirthday = " + userBirthday);


        if (userBirthday.isBefore(LocalDate.now())){
            System.out.println("Welcome to your account");
        }else {
            System.out.println("Invalid date");
        }



    }
}
