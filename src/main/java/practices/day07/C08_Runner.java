package practices.day07;

import java.util.Scanner;

public class C08_Runner {
    public static void main(String[] args) {
        //TASK: Check if a person is applicable for blood donation or not. Minimum age requirement is 18.
        // If a person is younger than 18, throw a custom exception MinimumAgeViolationException.
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your age:");
        int age = input.nextInt();
        input.nextLine();
        try {
            if (age >= 18){
                System.out.println("Please fill out the form given to you.");
            }else {
                throw new MinimumAgeViolationException("You are not applicable for blood donation. You have to be at " +
                        "least 18 years old.");
            }
        } catch (MinimumAgeViolationException e){
            System.out.println(e.getMessage());
        }
        System.out.println("The app continues running");
    }
}
