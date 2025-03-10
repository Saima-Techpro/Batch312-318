package practices.day03;

import java.util.Scanner;

public class C05_WhileLoops {
    public static void main(String[] args) {
        //TASK: Ask the user to enter some integers. If the sum of those integers exceeds 500, tell
        //the user the sum exceed 500, they cannot continue and show the sum afterward.

        Scanner input = new Scanner(System.in);
        int sum = 0;
        int number;
        while(sum <= 500){
            System.out.println("Please enter an integer for summation.");
            number = input.nextInt();
            input.nextLine();

            sum += number;
        }
        System.out.println("The sum exceeded 500, you cannot continue adding new numbers.");
        System.out.println("The sum is: " + sum);

        //HW: Use Random class and pick a random integer from 1-100.
        //1- Ask the user to guess the number.
        //2- With each guess, tell the user to increase/decrease the guess depending on the actual number.
        //3- Once the user finds the number, tell the user how many guesses it took for them to find the number.
        //4- The user can guess only 5 times. If the user cannot find the number in 5 guesses, exit the loop and print a message to encourage the player to try again.
        //You will use: Random random = new Random();
        //You will use: int actualNumber = random.nextInt(100);
    }
}
