package day13loops;

import java.util.Scanner;

public class DoWhileLoop02 {
    public static void main(String[] args) {
        /*
         Ask user to enter an integer.
        If the integer is less than 100, tell user "You lost!".
        Otherwise, tell user "You won!"
         */

        Scanner scan = new Scanner(System.in);


        int number;

        do{
            System.out.println("Enter a number please");
             number = scan.nextInt();

            if (number < 0 ){
                System.out.println("You can't enter negative numbers");
                break;
            }else if ( number > 0 && number < 100){
                System.out.println("You lost!");
            }else {
                System.out.println("You won!");

            }



        } while (number < 100);

        System.out.println("==============");
        // chatGPT solution:

        do {
            System.out.print("Enter a non-negative integer: ");
            number = scan.nextInt();

            if (number < 0) {
                System.out.println("Invalid input! Please enter a non-negative integer.");
            } else if (number < 100) {
                System.out.println("You lost!");
            } else {
                System.out.println("You won!");
            }
        } while (number < 100); // Loop continues until the user wins






    }
}
