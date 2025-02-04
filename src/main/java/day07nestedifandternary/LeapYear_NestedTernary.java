package day07nestedifandternary;

import java.util.Scanner;

public class LeapYear_NestedTernary {
    public static void main(String[] args) {

        /*
         Write a Java program to determine if a given year is a leap year or not.
        A year is a leap year if:
            It is divisible by 4.
            It is divisible by 100, it must also be divisible by 400.

            NOTE: Use NESTED TERNARY

Example:
Year 2000: Divisible by 4, 100, and 400 → Leap Year.
Year 1900: Divisible by 4 and 100, but not by 400 → Not a Leap Year.
Year 2024: Divisible by 4 and not by 100 → Leap Year.
         */


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the year please");

        int year = scanner.nextInt();

        // Single Ternary syntax => checking all 3 conditions at once using && and || operators
        String result  = (year % 4 == 0 && (year % 100 !=0 || year % 400 == 0 )) ? ("Leap Year") : ("Not a Leap Year") ;
        System.out.println("result = " + result);


        // nested Ternary

        String nestedResult = (year % 4 ==0 ) ? ( (year % 100 == 0) ? (year % 400 == 0) ? "Leap Year" : "Not a Leap Year" : " Leap Year" ) : ("Not Leap Year") ;

        System.out.println("nestedResult = " + nestedResult);


    }
}
