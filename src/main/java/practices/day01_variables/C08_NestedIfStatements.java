package practices.day01_variables;

import java.util.Scanner;

public class C08_NestedIfStatements {
    public static void main(String[] args) {
        //TASK: Check if a person can donate blood or not. Requirements:
        //Age >= 18
        //Weight >= 50

        //STEP 1: Create a Scanner
        Scanner input = new Scanner(System.in);

        //STEP 2: Inform the user about the operation.
        System.out.println("Please enter your age.");

        int age = input.nextInt();
        input.nextLine();

        if (age >= 18){
            System.out.println("Please enter your weight.");
            double weight = input.nextDouble();
            input.nextLine();
            if (weight >= 50){
                System.out.println("You are applicable for blood donation. Please fill out this form to continue.");
            }else {
                System.out.println("You are not applicable for blood donation! Please gain some more weight!");
            }
        }else {
            System.out.println("You are not old enough for blood donation. Please wait " + (18-age) + " years.");
        }
    }
}
