package day06switchternary;

import java.util.Scanner;

public class Switch03 {
    public static void main(String[] args) {

        // Create a simplified version of a calculator.
        // Ask user to provide two numbers and perform the mathematical operation chosen by the user.
        // + , -, *  , / , %


        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter first number");
        double firstNumber = scanner.nextDouble();

        System.out.println("Please enter second number");
        double secondNumber = scanner.nextDouble();

        System.out.println("Which operator would you like to choose from + , - , / , * or %");
        String operation = scanner.next();

        switch (operation){
            case "+":
                double total = (firstNumber + secondNumber);
                System.out.println("total = " + total);
                break;
            case "-":
                System.out.println("subtraction: " + (firstNumber - secondNumber));
                break;

            case "/":
                System.out.println("division: "+ (firstNumber / secondNumber));
                break;
            case "*":
                System.out.println("multiplication: "+ (firstNumber * secondNumber));
                break;
            case "%":
                System.out.println("modulus: "+ (firstNumber % secondNumber));
                break;
            default:
                System.out.println("This calculator doesn't support "+ operation +  "function!");
        }



    }
}
