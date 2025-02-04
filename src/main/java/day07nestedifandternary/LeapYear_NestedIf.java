package day07nestedifandternary;

import java.util.Scanner;

public class LeapYear_NestedIf {
    public static void main(String[] args) {

         /*
         Write a Java program to determine if a given year is a leap year or not.
        A year is a leap year if:
            It is divisible by 4.
            It is divisible by 100, it must also be divisible by 400.

            NOTE: Use NESTED IF

Example:
Year 2000: Divisible by 4, 100, and 400 → Leap Year.
Year 1900: Divisible by 4 and 100, but not by 400 → Not a Leap Year.
Year 2024: Divisible by 4 and not by 100 → Leap Year.
         */

        /*
        SYNTAX OF NESTED IF

        if (){  // primary condition

            if (){ // secondary condition

            }else {

            }

        }else {


        }

         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the year please");
        int year = scanner.nextInt();

        if (year%4 ==0 ){ // first check: if the year is divisible by 4

            if (year % 100 == 0){  // second check: if the year is century year or not

                if (year % 400 == 0){ // third check: if the century year is divisible by 400 or not
                    System.out.println("Leap Year");
                }else {
                    System.out.println("Not a Leap Year");
                }


            }else {
                System.out.println("Leap Year"); // year is divisible by 4, but it's not a century year
            }

        }else {
            System.out.println("Not a Leap Year"); // if the year is not divisible by 4
        }

        System.out.println("======== using if-else if-else ===========");

        // Using if-else if-else (Preferred according to chatGPT)
        if (year % 400 == 0) { // Check first (most restrictive)
            System.out.println("Leap Year");
        } else if (year % 100 == 0) { // Century year but not divisible by 400
            System.out.println("Not a Leap Year");
        } else if (year % 4 == 0) { // Divisible by 4 but not a century year
            System.out.println("Leap Year");
        } else { // Not divisible by 4 at all
            System.out.println("Not a Leap Year");
        }

        /*
        Why is if-else if-else the best?
    ✅ Readable – Easy to understand for beginners and experienced programmers.
    ✅ Structured – No unnecessary nesting.
    ✅ Efficient – Checks year % 400 first (quickly resolves century years).
    ✅ Easier Debugging – No deep nesting or complex ternary chains.
         */








    }
}
