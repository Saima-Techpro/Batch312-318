package practices.day03;

import java.util.Scanner;

public class C02_ForLoops {
    public static void main(String[] args) {
        /*
        //TASK: Take a number from the user. Print the multiplication table of that number
        //by all the integers from 1-10. Example:
        // 5 x 1 = 5
        // 5 x 2 = 10
        //...
        // 5 x 10 = 50

        //STEP 1: Creating a Scanner
        Scanner input = new Scanner(System.in);

        //STEP 2: Informing the user
        System.out.println("Please enter an integer.");

        //STEP 3: Assigning the input to a variable
        int enteredNumber = input.nextInt();
        input.nextLine();

        //STEP 4: For loop
        for (int i = 1; i <= 10; i++){
            System.out.println(enteredNumber + " x " + i + " = " + enteredNumber*i);
        }*/

        //TASK 2: Print the whole 10x10 multiplication table.
        /*for (int i = 1; i <= 10; i++){
            for (int j = 1; j <= 10; j++){
                System.out.print(i + " x " + j + " = " + i*j + "       |");
            }
            System.out.println();
        }*/

        //TASK 3: Ask the user for an integer less than 10.
        //Then calculate the factorial of that integer.

        //STEP 1: Creating a Scanner
        Scanner input = new Scanner(System.in);

        //STEP 2: Informing the user
        System.out.println("Please enter an integer.");

        byte enteredNumber = input.nextByte();
        int result = 1;

        if (enteredNumber < 0 || enteredNumber > 10){
            System.out.println("Please enter a number from the range 1-20");
        }else {
            for (int i = enteredNumber; i > 1; i--){
                result *= i;
            }
            System.out.println("Result of factorial = " + result);
        }
    }
}
