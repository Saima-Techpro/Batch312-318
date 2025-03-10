package practices.day01_variables;

import java.util.Scanner;

public class C07_IfStatements {
    public static void main(String[] args) {
        //TASK: Ask the user for grades out of 100. Convert the grades to the letter-grading system.
        //If less than 50   -> Print "D"
        //If =50 < 60       -> Print "C"
        //If =60 < 80       -> Print "B"
        //If =80 < 100      -> Print "A"

        //Step 1: Create a Scanner
        Scanner input = new Scanner(System.in);

        //Step 2: Inform the user and assign the value to a variable.
        System.out.println("Please enter a grade out of 100");
        double numericGrade = input.nextDouble(); //Grades can be a float-point number: 68.5 for example.

        //Step 3: Conversions
        if (numericGrade > 100 || numericGrade < 0){
            System.out.println("The entered grade is invalid. The grade must be between 0-100.");
        }else if(numericGrade < 50){
            System.out.println("D");
        }else if(numericGrade < 60){
            System.out.println("C");
        }else if(numericGrade < 80){
            System.out.println("B");
        }else{
            System.out.println("A");
        }
    }
}
