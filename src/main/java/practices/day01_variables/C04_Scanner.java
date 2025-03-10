package practices.day01_variables;

import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {
        //TASK: Print the circumference and the area of a circle. Take the radius of the
        //circle from the user.
        //Assume that pi = 3.14
        //Circumference = 2 * pi * radius - Area = pi * radius * radius

        //Step 1: Create a Scanner
        Scanner input = new Scanner(System.in);

        //Step 2: Give the info to user.
        System.out.println("Please enter the radius of your circle:");

        //Step 3: Take the input, and assign it to a variable.
        double radius = input.nextDouble();

        //Step 4: Calculate the circumference and area.

        double pi = 3.14; //We could also use Math.PI inside the print statements.

        //Math class is a class that we use when basic arithmetic operators are not satisfying our needs.

        System.out.println("Circumference: " + 2 * pi * radius);
        //System.out.println("Circumference:" + 2 * Math.PI * radius);

        System.out.println("Area:" + pi * radius * radius); // Math.pow(radius, 2) gives the same result.

    }
}
