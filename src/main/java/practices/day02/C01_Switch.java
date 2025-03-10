package practices.day02;

import java.util.Scanner;

public class C01_Switch {
    public static void main(String[] args) {
        //TASK: Develop a simple calculator that does these operations on 2 numbers:
        //Addition, subtraction, multiplication, division, remainder calculation,
        //power calculation.

        //HW: Check division by 0 case. If the second number is zero, then print an error message.

        //STEP 1: Create a Scanner
        Scanner input = new Scanner(System.in);

        //STEP 2: Inform the user about which operation they want to do.
        System.out.println("Please enter the operator that you want to use: \nFor addition: +\nFor subtraction: -\nFor multiplication: *\nFor division: /\nFor remainder calculation: %\nFor power calculation: ^");

        //STEP 3: Take the input and assign it to a character.

        char operator = input.next().charAt(0);
        input.nextLine();

        double number1;
        double number2;

        switch (operator){
            case '+':
                System.out.println("Please enter two numbers that you want to add:");
                System.out.println("Sum of the numbers: " + (input.nextDouble() + input.nextDouble()));
                input.nextLine();
                break;
            case '-':
                System.out.println("Please enter two numbers that you want to subtract, second number will be subtracted from the first number:");
                System.out.println("Subtraction of the numbers: " + (input.nextDouble() - input.nextDouble()));
                input.nextLine();
                break;
            case '*':
                System.out.println("Please enter two numbers that you want to multiply:");
                System.out.println("Multiplication of the numbers: " + (input.nextDouble() * input.nextDouble()));
                input.nextLine();
                break;
            case '/':
                System.out.println("Please enter two numbers that you want to divide:");
                number1 = input.nextDouble();
                number2 = input.nextDouble();

                if (number2 == 0){
                    System.out.println("Please enter valid numbers for division.");
                }else {
                    System.out.println("Division of the numbers: " + (number1 / number2));
                }
                input.nextLine();
                break;
            case '%':
                System.out.println("Please enter two numbers that you want to take the modulus of:");
                number1 = input.nextDouble();
                number2 = input.nextDouble();

                if (number2 == 0){
                    System.out.println("Please enter valid numbers for division.");
                }else {
                    System.out.println("Remainder of division: " + (number1 % number2));
                }
                input.nextLine();
                break;
            case '^':
                System.out.println("Please enter a number, and a power for that number:");
                //System.out.println("Result: " + (Math.pow(input.nextDouble(), input.nextDouble())));
                number1 = input.nextDouble();
                number2 = input.nextDouble();

                double result = 1.0;
                for (int i = 1; i <= number2; i++){
                    result *= number1;
                }
                System.out.println("Result = " + result);

                input.nextLine();
                break;
            default:
                System.out.println("You did not enter a valid operator. Please enter one of the operators given in the main menu.");
                break;
        }
    }
}
