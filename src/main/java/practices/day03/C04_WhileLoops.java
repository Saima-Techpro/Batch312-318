package practices.day03;

import java.util.Scanner;

public class C04_WhileLoops {

    //If the cycle count is known / determined, we use for loops.
    //If not, we use while or do-while loops.

    //If you need to run the loop once without condition check, use do-while loops.
    //If not, use while loop.

    public static void main(String[] args) {
        //TASK: Ask the user for the numbers they want to take the sum of. Continue until
        //user enters 0.
        //If the entered number is 0, proceed with the addition and give the result.

        //STEP 1: Create a Scanner
        Scanner input = new Scanner(System.in);

        //STEP 2: Inform the user
        //..........

        int number;
        int sum = 0;

        do {
            System.out.println("Please enter an integer for summation.");
            number = input.nextInt();
            input.nextLine();

            sum += number;
        }while (number != 0);

        System.out.println("The sum of the numbers you entered: " + sum);
    }
}
