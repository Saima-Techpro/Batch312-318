package practices.day02;

import java.util.Scanner;

public class C02_TernaryOperator {
    public static void main(String[] args) {
        //TASK: Ask the user to enter a letter.
        //Print if the letter is a vowel or a consonant.
        //If the value is not a letter, or if it is more than 1 character long, print an error message.
        //Vowels: a, e, i, o, u

        //STEP 1: Create a Scanner
        Scanner input = new Scanner(System.in);

        //STEP 2: Inform the user about the input.
        System.out.println("Please enter a letter that you want to check.");

        //STEP 3: Assign the letter that the user enters to a String.
        String userInput = input.nextLine().toLowerCase();

        userInput = userInput.replaceAll("[^a-z]", "0");
        userInput = userInput.replaceAll("[aeiou]", "a");

        /*
        if (userInput.contains("^") || userInput.length() != 1){
            System.out.println("You did not enter a letter. Please enter a letter for the test.");
        }else {
            if (userInput.equals("a")){
                System.out.println("The letter you entered is a vowel.");
            }else {
                System.out.println("The letter you entered is a consonant.");
            }
        }
         */

        String string = userInput.contains("0") || userInput.length() != 1
                ? "You did not enter a letter. Please enter a letter for the test."
                : (userInput.equals("a"))
                    ? "The letter you entered is a vowel."
                    : "The letter you entered is a consonant";

        System.out.println(string);
    }
}
