package practices.day01_variables;

import java.util.Scanner;

public class C06_IfStatements {
    public static void main(String[] args) {
        //TASK 1: Create an if statement that would print if a number entered by a user is even or odd.

        //SOLUTION:

        //Step 1: Create a scanner:
        Scanner input = new Scanner(System.in);
        /*
        //Step 2: Inform the user and assign the number to a variable.
        System.out.println("Please enter an integer: ");

        int number1 = input.nextInt();
        input.nextLine(); //Clears the input buffer

        //Step 3: Check if the number is odd or even.

        if (number1 % 2 == 0){ // % -> modulus operator, gives the remainder from division.
            System.out.println("The number is even.");
        }else {
            System.out.println("The number is odd.");
        }
         */

        //TASK 2: Check if a number is positive or negative, or zero.

        System.out.println("Please enter a number:");
        double number2 = input.nextDouble();
        input.nextLine();

        if (number2 > 0){
            System.out.println("The number is positive.");
        }else if (number2 < 0){
            System.out.println("The number is negative.");
        }else{
            System.out.println("The number is zero.");
        }


    }
}
