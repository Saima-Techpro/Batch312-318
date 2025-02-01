package day05ifstatements;

import java.util.Scanner;

public class IfStatement02 {
    public static void main(String[] args) {
        // Get the number from the user and check if it's ODD or EVEN

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a number");
        int number = scan.nextInt();

        /*
        1st way:

        if (number % 2 == 0){
            System.out.println(number + " is EVEN");
        }

        if (number % 2 != 0){
            System.out.println(number + " is ODD");
        }

        NOTE: Java has to work twice in above if statements because
         it needs to check two conditions separately
         */

        // 2nd way:
        if (number % 2 == 0){
            System.out.println(number + " is EVEN");
        }else {
            System.out.println(number + " is ODD");
        }


        // 3rd way:
        if (number % 2 == 0){
            System.out.println(number + " is EVEN");
        } else if (number % 2 != 0) {
            System.out.println(number + " is ODD");
        }


        /*
        RULE: Make your application work faster and more efficient
            1. Avoid repetition
            2. Make Java work less wherever and whenever it's possible
         */









    }
}
