package day04wrapper_increment_decrement;

import java.util.Scanner;

public class Modulus {
    public static void main(String[] args) {

        // Ask user to enter 5 digit integer value, calculate the addition of the first 2 and the last 2 digits
        // Example: 65743  => 65  +  43  = 108

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a 5 digit number please");
        int number = scanner.nextInt();

        // first two digits
        int firstTwoDigits = number / 1000;
        System.out.println("firstTwoDigits = " + firstTwoDigits);

        // last two digits
        int lastTwoDigits = number % 100;  // % modulus operator => returns the remainder of any division operation
        System.out.println("lastTwoDigits = " + lastTwoDigits);

        int result = (firstTwoDigits + lastTwoDigits) ;
        System.out.println("result = " + result);


    }
}
